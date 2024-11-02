package com.cjc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.RailInfo;
import com.cjc.service.IRCTCService;
import com.cjc.service.repository.IRCTCrepository;

@Service
public class IRCTCServiceIMPL implements IRCTCService {

	@Autowired
	private IRCTCrepository repo;

	@Override
	public RailInfo getTrainDetails(int trainNo) {
		if (repo.existsById(trainNo))

			return repo.findById(trainNo).get();

		else
			return null;
	}

	@Override
	public Object updateTrainDetails(int trainNo, RailInfo info) {
		RailInfo railInfo = repo.findById(trainNo).get();
		if (railInfo != null) {
			railInfo.setName(info.getName());
			railInfo.setSource(info.getSource());
			railInfo.setDestination(info.getDestination());
			railInfo.setCurrentStatus(info.getCurrentStatus());

			return repo.save(railInfo);
		}
		return "ID not Found";
	}

}
