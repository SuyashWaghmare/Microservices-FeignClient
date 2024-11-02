package com.cjc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.communication.FiegnClientCommunication;
import com.cjc.model.RailInfo;
import com.cjc.service.WIMTService;

@Service
public class WIMTServiceIMPL implements WIMTService {

	@Autowired
	private FiegnClientCommunication com;

	@Override
	public RailInfo getTrainDetails(int trainNo) {
		return com.getTrainDetails(trainNo);
	}

	@Override
	public Object updateTrainDetails(int trainNo, RailInfo info) {
		return com.updateTrainDetails(trainNo, info);
	}

}
