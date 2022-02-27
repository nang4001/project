package com.myspring.pro27.member.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("qualityTestVO")
public class QualityTestVO {

	private String customerCode;
	private String customerName;
	private String itemCode;
	private String itemName;
	private String lotNo;
	private int quantity;
	private String serialNo;
	private String storageCode;
	private String storageName;
	private Date testDate;
	private String testResult;
	private int unitPrice;
	private String userName;
	private Date writeDate;
	
	public QualityTestVO() {
		
	}
	
	public QualityTestVO(String customerCode,String customerName,String itemCode,String itemName,String lotNo,int quantity,String serialNo,String storageCode,String storageName,Date testDate,String testResult,int unitPrice,String userName,Date writeDate) {
		this.setCustomerCode(customerCode);
		this.setCustomerName(customerName);
		this.setItemCode(itemCode);
		this.setItemName(itemName);
		this.setLotNo(lotNo);
		this.setQuantity(quantity);
		this.setSerialNo(serialNo);
		this.setStorageCode(storageCode);
		this.setStorageName(storageName);
		this.setTestDate(testDate);
		this.setTestResult(testResult);
		this.setUnitPrice(unitPrice);
		this.setUserName(userName);
		this.setWriteDate(writeDate);
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getLotNo() {
		return lotNo;
	}

	public void setLotNo(String lotNo) {
		this.lotNo = lotNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getStorageCode() {
		return storageCode;
	}

	public void setStorageCode(String storageCode) {
		this.storageCode = storageCode;
	}

	public String getStorageName() {
		return storageName;
	}

	public void setStorageName(String storageName) {
		this.storageName = storageName;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	
	
}
