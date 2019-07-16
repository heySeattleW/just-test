package com.hey.justtest.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProductPriceModel implements Serializable {

    private static final long serialVersionUID = 578343723567136969L;

    public static final BigDecimal UNKOWN = new BigDecimal(-1);
    public static final String INUSE_STATUS = "0";
    public static final String DISABLED_STATUS = "1";

    public static final String NOT_FORBIDDEN = "0";
    public static final String FORBIDDEN = "1";

    private Long id;

    private Long dbid;
    private Long productSummaryId;
    private Long productId;
    private Long customerTypeId;
    private String isForbidden;

    private String status;
    private String remark;

    private Date modifyTime;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDbid() {
        return dbid;
    }

    public void setDbid(Long dbid) {
        this.dbid = dbid;
    }

    public Long getProductSummaryId() {
        return productSummaryId;
    }

    public void setProductSummaryId(Long productSummaryId) {
        this.productSummaryId = productSummaryId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Long customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getIsForbidden() {
        return isForbidden;
    }

    public void setIsForbidden(String isForbidden) {
        this.isForbidden = isForbidden;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }




}