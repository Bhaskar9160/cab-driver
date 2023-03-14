package com.akhm.service;


import com.akhm.repository.entity.DriverTl;

public interface DriverService {
	public DriverTl saveDriver(DriverTl driverTl);
	public DriverTl getDriver(String emailId,String password);
	public DriverTl updateDriver(DriverTl driverTl);
	public DriverTl findDriver(DriverTl driverTl);
	

}
