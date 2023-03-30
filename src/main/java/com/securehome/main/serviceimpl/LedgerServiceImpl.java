package com.SecureHome.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureHome.main.model.Ledger;
import com.SecureHome.main.repositoryi.LedgerRepositoryI;
import com.SecureHome.main.servicei.LedgerServiceI;
@Service
public class LedgerServiceImpl implements LedgerServiceI{

	@Autowired
	private LedgerRepositoryI lri;	
	
	@Override
	public Ledger storeLedger(Ledger l) {
		Ledger ledger=lri.save(l);
		return null;
	}

		
}
