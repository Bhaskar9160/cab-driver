package com.akhm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.akhm.repository.entity.DriverTl;

import com.akhm.service.DriverService;

import lombok.extern.slf4j.Slf4j;
@Controller
@Slf4j
public class DriverController {
	@Autowired
	private DriverService driverService;
	
	@GetMapping("/reg")
	public String showRegistration() {

		return "registration";
	}

	@PostMapping("/reg")
	public String registration(DriverTl driverTl) {
		log.info("In DriverController .. registration started");
		DriverTl _driverTl = driverService.saveDriver(driverTl);
		log.info("In DriverController .. registration successfully completed");
		return "redirect:login";
	}

	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}

	@PostMapping("/log")
	public String login(DriverTl driverTl, HttpServletRequest request) {
		log.info("In AdminController .. login() started");
		DriverTl driver = driverService.getDriver(driverTl.getEmailId(),driverTl.getPassword());
		System.out.println("user details are " + driver);
		log.info("In DriverController .. login successfully completed");
		System.out.println(driver != null);
		if (driver != null) {

			HttpSession session = request.getSession();
			System.out.println("If");
			session.setAttribute("AUTH_DRIVER", driver);
			return "redirect:driverhome";
		} else {
			return "redirect:login?errorMessage=Invaid emailId or password";
		}

	}

	@GetMapping("/driverhome")
	public String driverHome(HttpServletRequest request) {

		HttpSession session = request.getSession(false);
		if (session != null) {

			DriverTl driver = (DriverTl) session.getAttribute("AUTH_DRIVER");
			System.out.println("AUTH_DRIVER" + driver);
			if (driver != null) {

				return "driverhome";
			}
		}
		return "redirect:login";
	}

	@GetMapping("/logout")
	public String logOut(HttpServletRequest request) {

		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:login";
	}
	
	@GetMapping("/changepassword")
	public String showChangePassword(HttpServletRequest request) {

		HttpSession session = request.getSession(false);
		if (session != null) {
			DriverTl auth_driver = (DriverTl) session.getAttribute("AUTH_DRIVER");
			if (auth_driver != null) {
				return "changepassword";
			}
		}
		return "redirect:login";
	}

	@PostMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {

		HttpSession session = request.getSession(false);
		if (session != null) {
			DriverTl auth_driver = (DriverTl) session.getAttribute("AUTH_DRIVER");
			if (auth_driver != null) {
				String oldPassword = request.getParameter("oldPassword");
				String newPassword = request.getParameter("newPassword");
				String confirmPassword = request.getParameter("confirmPassword");
				if (oldPassword.equals(auth_driver.getPassword()) && newPassword.equals(confirmPassword)) {
					auth_driver.setPassword(newPassword);
					driverService.updateDriver(auth_driver);
				}
				return "redirect:driverhome";
			}
		}
		return "redirect:login";

		}
	
	@GetMapping("/editprofile")
	public String showEditProfile(HttpServletRequest request) {

		HttpSession session = request.getSession(false);
		if (session != null) {
			DriverTl auth_driver = (DriverTl) session.getAttribute("AUTH_DRIVER");
			if (auth_driver != null) {
				return "editprofile";
			}
		}
		return "redirect:login";
	}

	@PostMapping("/editprofile")
	public String updateProfile(HttpServletRequest request, DriverTl driverTl) {

		HttpSession session = request.getSession(false);
		if (session != null) {
			DriverTl auth_driver = (DriverTl) session.getAttribute("auth_driver");
			if (auth_driver != null) {
				auth_driver.setFirstName(driverTl.getFirstName());
				auth_driver.setMobileNumber(driverTl.getMobileNumber());
				driverService.findDriver(auth_driver);
				return "redirect:editprofile";
			}
		}
		return "redirect:login";
	}
}