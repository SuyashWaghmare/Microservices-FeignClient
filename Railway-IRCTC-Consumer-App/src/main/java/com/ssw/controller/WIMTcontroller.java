package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.RailInfo;
import com.cjc.service.WIMTService;

@RestController
@RequestMapping("/consumer-api")
public class WIMTcontroller {
	
	@Autowired
	private WIMTService service;
	
	
	@GetMapping("/getTrainDetails/{trainNo}")
	public ResponseEntity<RailInfo> getTrainDetails(@PathVariable int trainNo)
	{
		return new ResponseEntity<RailInfo>(service.getTrainDetails(trainNo),HttpStatus.OK);
		
	}

	@PutMapping("/updateTrainDetails/{trainNo}")
	public ResponseEntity<Object> updateTrainDetails(@PathVariable int trainNo,@RequestBody RailInfo info)
	{
		return new ResponseEntity<Object>(service.updateTrainDetails(trainNo,info),HttpStatus.OK);
		
	}
	
	
	
}
