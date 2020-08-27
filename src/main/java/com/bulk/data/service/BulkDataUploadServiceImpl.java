package com.bulk.data.service;

import java.util.Map;

import org.json.simple.JSONValue;
import org.springframework.stereotype.Service;

import com.bulk.data.dto.User;

@Service
public class BulkDataUploadServiceImpl implements  BulkDataUploadService{
	
	public boolean saveComplexJson(User user) {
		Map<String, Object> userData = user.getUserData();
		
		String userDataBacktoJson = JSONValue.toJSONString(userData);
		System.out.println("userDataBacktoJson "+userDataBacktoJson);
		
		byte[] userDatatoBytes = userDataBacktoJson.getBytes();
		//we can store userDatatoBytes to bytea type in postgresql
		System.out.println(userDatatoBytes);
		
		return true;
	}
	

}
