package com.akhm.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.akhm.repository.entity.DriverTl;

public interface DriverRepository extends JpaRepository<DriverTl, Integer>{
	public DriverTl findByEmailIdAndPassword(String emailId,String password);
}
