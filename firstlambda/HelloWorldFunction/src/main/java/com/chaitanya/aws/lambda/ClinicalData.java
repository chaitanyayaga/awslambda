package com.chaitanya.aws.lambda;

public class ClinicalData {
	
	private String bp;
	public String getBp() {
		return bp;
	}
	public void setBp(String bp) {
		this.bp = bp;
	}
	public String getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}
	private String heartRate;
	

}
