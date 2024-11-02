package com.cjc.model;

public class RailInfo {

	private int trainNo;
	private String name;
	private String source;
	private String destination;
	private String currentStatus;

	public RailInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RailInfo(int trainNo, String name, String source, String destination, String currentStatus) {
		super();
		this.trainNo = trainNo;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.currentStatus = currentStatus;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

}
