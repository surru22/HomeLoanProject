package com.SecureHome.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureHome.main.model.PreviousBankDetails;
import com.SecureHome.main.repositoryi.PreviousBankDetailsRepositoryI;
import com.SecureHome.main.servicei.PreviousBankDetailsServiceI;
@Service
public class PreviousBankDetailsServiceImpl implements PreviousBankDetailsServiceI{

	@Autowired
	private PreviousBankDetailsRepositoryI pbdri;
	
	@Override
	public PreviousBankDetails storePreviousBankDetails(PreviousBankDetails pbd) {
		PreviousBankDetails previousbankdetails=pbdri.save(pbd);
		return previousbankdetails;
	}

	
}
