package com.myspring.pro27.member.vo;

import org.springframework.stereotype.Component;

@Component("carVO")
public class CarVO {

		private String carCode;
		private String carName;
		private String carNo;
		private String carWeight;
		
		public CarVO() {
			
		}
		public CarVO(String carCode,String carNo, String carWeight, String carName) {
			
		}
		public String getCarCode() {
			return carCode;
		}
		public void setCarCode(String carCode) {
			this.carCode = carCode;
		}
		public String getCarName() {
			return carName;
		}
		public void setCarName(String carName) {
			this.carName = carName;
		}
		public String getCarNo() {
			return carNo;
		}
		public void setCarNo(String carNo) {
			this.carNo = carNo;
		}
		public String getCarWeight() {
			return carWeight;
		}
		public void setCarWeight(String carWeight) {
			this.carWeight = carWeight;
		}
	}
