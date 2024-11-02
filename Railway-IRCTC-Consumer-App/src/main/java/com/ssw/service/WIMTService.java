package com.cjc.service;

import com.cjc.model.RailInfo;

public interface WIMTService {

	RailInfo getTrainDetails(int trainNo);

	Object updateTrainDetails(int trainNo, RailInfo info);

}
