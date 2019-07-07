package com.xworkz.registartionapp.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Response {
	
	private String errorMessage;

	@JsonInclude(Include.NON_NULL)
	private List<SavedObjects> dataList;
	
	@JsonInclude(Include.NON_NULL)
	private List<Object> storedDataList;
	
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<SavedObjects> getDataList() {
		return dataList;
	}

	public void setDataList(List<SavedObjects> dataList) {
		this.dataList = dataList;
	}

	public List<Object> getStoredDataList() {
		return storedDataList;
	}

	public void setStoredDataList(List<Object> storedDataList) {
		this.storedDataList = storedDataList;
	}

}
