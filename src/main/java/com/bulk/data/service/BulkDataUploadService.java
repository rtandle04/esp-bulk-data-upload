package com.bulk.data.service;

import com.bulk.data.dto.User;

public interface BulkDataUploadService {

	/**
	 * saves the complex json in a single field
	 * @param user
	 * @return
	 */
	boolean saveComplexJson(User user); 
}
