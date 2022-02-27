package com.myspring.pro27.member.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("itemVO")
public class ItemVO {
	private String itemCode;
	private String itemName;
	private String lotNo;
	private Date orderDate;
	private int price;
	private int quantity;
	private String serialNo;
	private String storageCode;
	private String storageName;
	private int supplyPrice;
	private String unit;
	private int unitPrice;
	private int vat;

	
	public ItemVO() {
		
	}

	public ItemVO(String itemCode,String itemName,String lotNo,Date orderDate,int price,int quantity,String serialNo,String storageCode,String storageName,int supplyPrice,String unit,int unitPrice, int vat) {
		this.setItemCode(itemCode);
		this.setItemName(itemName);
		this.setLotNo(lotNo);
		this.setOrderDate(orderDate);
		this.setPrice(price);
		this.setQuantity(quantity);
		this.setSerialNo(serialNo);
		this.setStorageCode(storageCode);
		this.setStorageName(storageName);
		this.setSupplyPrice(supplyPrice);
		this.setUnit(unit);
		this.setUnitPrice(unitPrice);
		this.setVat(vat);
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

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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

	public int getSupplyPrice() {
		return supplyPrice;
	}

	public void setSupplyPrice(int supplyPrice) {
		this.supplyPrice = supplyPrice;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}
}
