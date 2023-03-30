package com.SecureHome.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PreviousBankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bankId;
	private String branchName;
	private int branchCode;
	private String branchAddress;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	@Override
	public String toString() {
		return "PreviousBankDetails [bankId=" + bankId + ", branchName=" + branchName + ", branchCode=" + branchCode
				+ ", branchAddress=" + branchAddress + "]";
	}
	
}
