package com.bulk.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bulk.data.dto.User;
import com.bulk.data.service.BulkDataUploadService;

@RestController
public class BulkDataUploadController {
	
	@Autowired
	private BulkDataUploadService bulkDataUploadService;
	
	@RequestMapping(value = "/saveComplexJson", method = RequestMethod.POST)
	public boolean saveComplexJson(@RequestBody User user) {
		bulkDataUploadService.saveComplexJson(user);
		return true;
	}
}
