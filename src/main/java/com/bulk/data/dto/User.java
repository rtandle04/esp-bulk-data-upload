package com.bulk.data.dto;

import java.util.Map;

public class User {

	private String userId;
	//capturing the complex json as a single field and converting map into json structure in service
	private Map<String,Object> userData;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userData
	 */
	public Map<String, Object> getUserData() {
		return userData;
	}

	/**
	 * @param userData the userData to set
	 */
	public void setUserData(Map<String, Object> userData) {
		this.userData = userData;
	}
	
}
