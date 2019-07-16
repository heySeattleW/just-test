package com.hey.justtest.entity;

import java.io.Serializable;

public class ProductPriceCustomerModel extends ProductPriceModel implements Serializable {
    
	private static final long serialVersionUID = -8456677630368949869L;
	
	public static final String INUSE_STATUS = "0";
    public static final String DISABLED_STATUS = "1";
    
    public static final String NOT_FORBIDDEN = "0";
    public static final String FORBIDDEN = "1";
    
    private Long customerId;

	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}



}