package com.SecureHome.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SecureHome.main.model.Ledger;
import com.SecureHome.main.servicei.LedgerServiceI;

@RestController
public class LedgerController {

	@Autowired
	private LedgerServiceI lsi;
	
	@PostMapping(value="/saveData")
	public String storeLedger(@RequestBody Ledger l)
	{
		Ledger ledger=lsi.storeLedger(l);
		return "Save To DB";
	}
	
}
