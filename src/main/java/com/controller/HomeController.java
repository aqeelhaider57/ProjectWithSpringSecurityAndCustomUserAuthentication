package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.model.Address;
import com.model.UserDetail;
import com.service.AddressService;
import com.service.UserService;

@RestController
public class HomeController {

	@Autowired
	UserService userService;

	@Autowired
	AddressService addressService;

	@RequestMapping(value = { "/home" })
	public List<UserDetail> index() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = { "/index" })
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message", "welcome to the home page one");
		return mv;
	}

	@RequestMapping(value = { "/login" })
	public List<Address> loginPage() {
		return addressService.getAllAddresses();
	}

}
