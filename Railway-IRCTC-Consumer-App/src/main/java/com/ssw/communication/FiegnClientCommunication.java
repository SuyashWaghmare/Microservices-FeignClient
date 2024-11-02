package com.cjc.communication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cjc.model.RailInfo;

@FeignClient(url = "http://localhost:9099/producer-api", name = "PRODUCER-SERVICE")
public interface FiegnClientCommunication {

	@GetMapping("/getTrainDetails/{trainNo}")
	RailInfo getTrainDetails(@PathVariable int trainNo);

	@PutMapping("/updateTrainDetails/{trainNo}")
	Object updateTrainDetails(@PathVariable int trainNo, @RequestBody RailInfo info);

}
