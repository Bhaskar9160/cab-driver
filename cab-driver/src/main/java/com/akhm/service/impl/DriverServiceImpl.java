package com.akhm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.repository.DriverRepository;

import com.akhm.repository.entity.DriverTl;
import com.akhm.service.DriverService;


@Service
public class DriverServiceImpl implements DriverService{
	@Autowired
	private DriverRepository repository;

	@Override
	public DriverTl saveDriver(DriverTl driverTl) {
		// TODO Auto-generated method stub
		DriverTl driver=null;
		driver=repository.save(driverTl);
		return driver;
		
	}

	@Override
	public DriverTl getDriver(String emailId, String password) {
		// TODO Auto-generated method stub
		DriverTl driver=repository.findByEmailIdAndPassword(emailId, password);
		return driver;
		
	}

	@Override
	public DriverTl updateDriver(DriverTl driverTl) {
		// TODO Auto-generated method stub
		DriverTl driver=repository.findById(driverTl.getDriverId()).get();
		if(driver!=null)
		{
			driver.setFirstName(driverTl.getFirstName());
			driver.setLastName(driverTl.getLastName());
			driver.setEmailId(driverTl.getEmailId());
			driver.setPassword(driverTl.getPassword());
			driver.setMobileNumber(driver.getMobileNumber());
			driver.setStatus(driverTl.getStatus());
			driver=repository.save(driver);
		}
		return driver;
		
	}

	@Override
	public DriverTl findDriver(DriverTl driverTl) {
		// TODO Auto-generated method stub
		return null;
	}
	
}