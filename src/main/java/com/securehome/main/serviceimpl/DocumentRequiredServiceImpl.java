package com.SecureHome.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureHome.main.model.DocumentRequired;
import com.SecureHome.main.repositoryi.DocumentRequiredRepositoryI;
import com.SecureHome.main.servicei.DocumentRequiredServiceI;
@Service
public class DocumentRequiredServiceImpl implements DocumentRequiredServiceI{

	@Autowired
	private DocumentRequiredRepositoryI drri;
	
	@Override
	public DocumentRequired storeDocumentRequired(DocumentRequired dr) {
		DocumentRequired documentrequired=drri.save(dr);
		return documentrequired;
	}

}
