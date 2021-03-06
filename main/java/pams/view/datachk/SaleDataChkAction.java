package pams.view.datachk;

import org.joda.time.DateTime;
import org.primefaces.model.LazyDataModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pams.common.SystemService;
import pams.common.utils.MessageUtil;
import pams.repository.model.Ptenudetail;
import pams.repository.model.Ptoplog;
import pams.repository.model.saledata.SaleDataChkVO;
import pams.repository.model.saledata.SaleDataQryParamBean;
import pams.service.datachk.SaleDataChkService;
import pub.platform.security.OperatorManager;
import skyline.service.PlatformService;
import skyline.service.ToolsService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 营销数据管理
 * User: zhanrui
 * Date: 13-3-3
 * Time: 上午11:20
 */

@ManagedBean
@ViewScoped
public class SaleDataChkAction implements Serializable {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private SaleDataQryParamBean paramBean;

    private SaleDataChkVO selectedRecord;
    private LazyDataModel<SaleDataChkVO> lazyDataModel;
    private List<SaleDataChkVO> selectedRecords;
    private List<SaleDataChkVO> filteredDetlList;

    private List<SelectItem> branchList;
    private List<SelectItem> prdTypeList;
    private List<SelectItem> checkFlagList;
    private List<SelectItem> reviewFlagList;
    private List<SelectItem> archiveFlagList;

    private String branchId;
    private String operId;


    @ManagedProperty(value = "#{toolsService}")
    private ToolsService toolsService;
    @ManagedProperty(value = "#{platformService}")
    private PlatformService platformService;

    @ManagedProperty(value = "#{saleDataChkService}")
    private SaleDataChkService saleDataChkService;

    public SaleDataChkAction() {
    }

    @PostConstruct
    public void init() {
        OperatorManager om = SystemService.getOperatorManager();
        branchId = om.getOperator().getDeptid();
        operId = om.getOperatorId();

        this.branchList = toolsService.selectBranchList(branchId);
        this.paramBean = new SaleDataQryParamBean();

        this.paramBean.setStartDate(new DateTime().dayOfMonth().withMinimumValue().toString("yyyy-MM-dd"));
        this.paramBean.setEndDate(new DateTime().toString("yyyy-MM-dd"));

        initPrdTypeList();

        SelectItem item = new SelectItem("", "");

        this.checkFlagList = new ArrayList<SelectItem>();
        this.checkFlagList.add(item);
        item = new SelectItem("0", "未检核");
        this.checkFlagList.add(item);
        item = new SelectItem("1", "未通过");
        this.checkFlagList.add(item);
        item = new SelectItem("2", "通过");
        this.checkFlagList.add(item);

        this.reviewFlagList = new ArrayList<SelectItem>();
        item = new SelectItem("", "");
        this.reviewFlagList.add(item);
        item = new SelectItem("0", "未申请复议");
        this.reviewFlagList.add(item);
        item = new SelectItem("1", "已申请复议");
        this.reviewFlagList.add(item);

        this.archiveFlagList = new ArrayList<SelectItem>();
        item = new SelectItem("", "");
        this.archiveFlagList.add(item);
        item = new SelectItem("0", "未归档");
        this.archiveFlagList.add(item);
        item = new SelectItem("1", "已归档");
        this.archiveFlagList.add(item);

    }

    public String onQuerySaleDeptData() {
        try {
            this.lazyDataModel = new DataChkQryModel(saleDataChkService.getSaleDataChkMapper(), this.paramBean);

            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("SaleDataChkAction_onQuerySaleDeptDatay");
            oplog.setActionName("营销历史管理:机构信息查询");
            oplog.setOpDataBranchid(this.paramBean.getBranchId());
            platformService.insertNewOperationLog(oplog);
        } catch (Exception e) {
            logger.error("查询数据时出现错误。", e);
            MessageUtil.addWarn("查询数据时出现错误。" + e.getMessage());
        }
        return null;
    }

    public String onQuerySaleTellerData() {
        try {
            this.paramBean.setBranchId(branchId);
            this.paramBean.setTellerId(operId);
            this.lazyDataModel = new DataChkQryModel(saleDataChkService.getSaleDataChkMapper(), this.paramBean);
            //this.paramBean.setTellerId(null);

            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("SaleDataChkAction_onQuerySaleTellerData");
            oplog.setActionName("营销历史管理:柜员信息查询");
            oplog.setOpDataBranchid(this.paramBean.getBranchId());
            platformService.insertNewOperationLog(oplog);
        } catch (Exception e) {
            logger.error("查询数据时出现错误。", e);
            MessageUtil.addWarn("查询数据时出现错误。" + e.getMessage());
        }
        return null;
    }

    public String onDeleteRecord() {

        try {
            //custMngService.deleteSaleDetailInfo(this.selectedSale);
            //salesVOList = custMngService.selectsaleDetails(selectedCust.getGuid());
        } catch (Exception e) {
            logger.error("数据删除错误！", e);
            MessageUtil.addError("数据删除错误！");
        }
        return null;
    }

    //数据检核
    public String onCheckAll() {
        try {
            List<SaleDataChkVO> saleDataChkVOList = (List<SaleDataChkVO>) this.lazyDataModel.getWrappedData();
            int checked = 0;
            for (SaleDataChkVO saleDataChkVO : saleDataChkVOList) {
                String checkflag = saleDataChkVO.getCheckflag();
                if (checkflag == null || "0".equals(checkflag)) {
                    saleDataChkService.processSaleDataCheck(saleDataChkVO);
                    checked++;
                }
            }

            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("SaleDataAction_onCheckAllUnChecked");
            oplog.setActionName("营销历史管理:数据检核");
            oplog.setOpDataBranchid(this.paramBean.getBranchId());
            platformService.insertNewOperationLog(oplog);

            MessageUtil.addError("数据检核完成, 检核处理记录条数: " + checked);
        } catch (Exception e) {
            logger.error("数据检核错误！", e);
            MessageUtil.addError("数据检核错误！" + e.getMessage());
        }
        return null;
    }

    public String onCheckUnpassed() {
        try {
            List<SaleDataChkVO> saleDataChkVOList = (List<SaleDataChkVO>) this.lazyDataModel.getWrappedData();
            int checked = 0;
            for (SaleDataChkVO saleDataChkVO : saleDataChkVOList) {
                String checkflag = saleDataChkVO.getCheckflag();
                if (checkflag != null && "1".equals(checkflag)) {
                    saleDataChkService.processSaleDataCheck(saleDataChkVO);
                    checked++;
                }
            }

            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("SaleDataAction_onCheckUnpassed");
            oplog.setActionName("营销历史管理:数据检核");
            oplog.setOpDataBranchid(this.paramBean.getBranchId());
            platformService.insertNewOperationLog(oplog);

            MessageUtil.addError("数据检核完成, 检核处理记录条数: " + checked);
        } catch (Exception e) {
            logger.error("数据检核错误！", e);
            MessageUtil.addError("数据检核错误！" + e.getMessage());
        }
        return null;
    }

    //数据检核
    public String onCheckSelected() {
        try {
            int checked = 0;
            for (SaleDataChkVO saleDataChkVO : this.selectedRecords) {
                saleDataChkService.processSaleDataCheck(saleDataChkVO);
                checked++;
            }

            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("SaleDataAction_onCheckSelected");
            oplog.setActionName("营销历史管理:数据检核-强制检核所选记录");
            oplog.setOpDataBranchid(this.paramBean.getBranchId());
            platformService.insertNewOperationLog(oplog);

            MessageUtil.addError("数据检核完成, 检核处理记录条数: " + checked);
        } catch (Exception e) {
            logger.error("数据检核错误！", e);
            MessageUtil.addError("数据检核错误！" + e.getMessage());
        }
        return null;
    }

    private void initPrdTypeList() {
        List<Ptenudetail> records = platformService.selectEnuDetail("SVTPRDTYPE");
        this.prdTypeList = new ArrayList<SelectItem>();
        SelectItem item = new SelectItem("", "全部产品");
        this.prdTypeList.add(item);
        for (Ptenudetail record : records) {
            item = new SelectItem(record.getEnuitemvalue(), record.getEnuitemlabel());
            this.prdTypeList.add(item);
        }
    }


    //====================================================


    public SaleDataQryParamBean getParamBean() {
        return paramBean;
    }

    public void setParamBean(SaleDataQryParamBean paramBean) {
        this.paramBean = paramBean;
    }

    public LazyDataModel<SaleDataChkVO> getLazyDataModel() {
        return lazyDataModel;
    }

    public void setLazyDataModel(LazyDataModel<SaleDataChkVO> lazyDataModel) {
        this.lazyDataModel = lazyDataModel;
    }

    public List<SelectItem> getBranchList() {
        return branchList;
    }

    public void setBranchList(List<SelectItem> branchList) {
        this.branchList = branchList;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public ToolsService getToolsService() {
        return toolsService;
    }

    public void setToolsService(ToolsService toolsService) {
        this.toolsService = toolsService;
    }

    public PlatformService getPlatformService() {
        return platformService;
    }

    public void setPlatformService(PlatformService platformService) {
        this.platformService = platformService;
    }


    public List<SelectItem> getPrdTypeList() {
        return prdTypeList;
    }

    public void setPrdTypeList(List<SelectItem> prdTypeList) {
        this.prdTypeList = prdTypeList;
    }

    public SaleDataChkService getSaleDataChkService() {
        return saleDataChkService;
    }

    public void setSaleDataChkService(SaleDataChkService saleDataChkService) {
        this.saleDataChkService = saleDataChkService;
    }

    public SaleDataChkVO getSelectedRecord() {
        return selectedRecord;
    }

    public void setSelectedRecord(SaleDataChkVO selectedRecord) {
        this.selectedRecord = selectedRecord;
    }

    public List<SelectItem> getCheckFlagList() {
        return checkFlagList;
    }

    public void setCheckFlagList(List<SelectItem> checkFlagList) {
        this.checkFlagList = checkFlagList;
    }

    public List<SelectItem> getReviewFlagList() {
        return reviewFlagList;
    }

    public void setReviewFlagList(List<SelectItem> reviewFlagList) {
        this.reviewFlagList = reviewFlagList;
    }

    public List<SelectItem> getArchiveFlagList() {
        return archiveFlagList;
    }

    public void setArchiveFlagList(List<SelectItem> archiveFlagList) {
        this.archiveFlagList = archiveFlagList;
    }

    public List<SaleDataChkVO> getFilteredDetlList() {
        return filteredDetlList;
    }

    public void setFilteredDetlList(List<SaleDataChkVO> filteredDetlList) {
        this.filteredDetlList = filteredDetlList;
    }

    public List<SaleDataChkVO> getSelectedRecords() {
        return selectedRecords;
    }

    public void setSelectedRecords(List<SaleDataChkVO> selectedRecords) {
        this.selectedRecords = selectedRecords;
    }
}

