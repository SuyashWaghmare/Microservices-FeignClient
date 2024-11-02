package com.cjc.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.RailInfo;
@Repository
public interface IRCTCrepository extends JpaRepository<RailInfo, Integer>{

}
