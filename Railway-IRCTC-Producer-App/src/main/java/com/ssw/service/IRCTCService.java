package com.cjc.service;

import org.springframework.util.MultiValueMap;

import com.cjc.model.RailInfo;

public interface IRCTCService {

	RailInfo getTrainDetails(int trainNo);

	Object updateTrainDetails(int trainNo, RailInfo info);

}
