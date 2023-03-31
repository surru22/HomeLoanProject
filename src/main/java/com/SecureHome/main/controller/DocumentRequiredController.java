package com.SecureHome.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.SecureHome.main.model.DocumentRequired;
import com.SecureHome.main.servicei.DocumentRequiredServiceI;
import com.google.gson.Gson;

@RestController
public class DocumentRequiredController {

		@Autowired
		private DocumentRequiredServiceI drsi;
		
		@RequestMapping(value="/savedata",method=RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public DocumentRequired storeDocumentRequired(@RequestPart( value="adharCard") MultipartFile f1,
				@RequestPart(required = true , value="panCard") MultipartFile f2,
				@RequestPart(required = true , value="last3MonthSalarySlip") MultipartFile f3,
				@RequestPart(required = true , value="incomeCertificate") MultipartFile f4,
				@RequestPart(required = true , value="propertyDocument") MultipartFile f5,
				@RequestPart(required = true , value="bankCheque") MultipartFile f6,
				@RequestPart(required = true , value="passportSizePhoto") MultipartFile f7,
				@RequestPart(required = true , value="last6MonthBankStatement") MultipartFile f8) throws IOException 
		{
			DocumentRequired d=new DocumentRequired();
			d.setAdharCard(f1.getBytes());
			d.setPanCard(f2.getBytes());
			d.setLast3MonthSalarySlip(f3.getBytes());
			d.setIncomeCertificate(f4.getBytes());
			d.setPropertyDocument(f5.getBytes());
			d.setBankCheque(f6.getBytes());
			d.setPassportSizePhoto(f7.getBytes());
			d.setLast6MonthBankStatement(f8.getBytes());
			System.out.println("lljbh");
			//Gson g=new Gson();
			
			//DocumentRequired drr=g.fromJson(DocumentRequired.class);
			//d.setDocumentId(drr.getDocumentId());
			
			DocumentRequired dr=drsi.storeDocumentRequired(d);
			return dr;
			//drsi.storeDocumentRequired(dr);
			//return "Save To DB";
		}
}
