package com.SecureHome.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SecureHome.main.model.PreviousBankDetails;
import com.SecureHome.main.servicei.PreviousBankDetailsServiceI;

@RestController
public class PreviousBankDetailsController {

	@Autowired
	private PreviousBankDetailsServiceI pbdsi;

	@PostMapping(value= "/save")
	public String saveData(@RequestBody PreviousBankDetails pbd)
	{
		PreviousBankDetails previousbankdetails=pbdsi.storePreviousBankDetails(pbd);
		return "Save To DB";
	}
}
