package com.akhm.repository.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="DRIVER_TL")
@Data
public class DriverTl {
	@Id
	@GeneratedValue
	@Column(name="DRIVER_ID")
	private Integer driverId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL_ID")
	private String emailId;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;
	@Column(name="STATUS")
	private String status;
	@Column(name = "UPDATEDON")
	private Date updatedOn;
	@Column(name = "CREATEDON")
	private Date createdOn;

}
