package com.yu.contoller;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yu.model.Customer1;
import com.yu.repository.*;
@RestController
@RequestMapping("/api/")
public class SqlController {
	@Autowired
	SqlConnectDbo db;
	@GetMapping(value="testAPI1")
	public ResponseEntity<?> customerInfomation(){
		List<Customer1> customers=db.Read();
		return new ResponseEntity<>(customers,HttpStatus.OK); 
		
	}

}
