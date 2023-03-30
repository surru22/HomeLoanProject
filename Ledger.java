package com.SecureHome.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Ledger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerId;
	private String ledgerCreatedDate;
	private int ledgerTotalLoanAmount;
	private double ledgerPayableAmountWithInterest;
	private int ledgerTenure;
	private double ledgerMonthlyEmi;
	private String ledgerAmountPaidTillDate;
	private int ledgerRemainingAmount;
	private String ledgerNextEmiDate;
	private String ledgerEmiStatus;
	private String ledgerCurrentMonthlyEmiStatus;
	private String ledgerLoanEndDate;
	private String status;
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	public String getLedgerCreatedDate() {
		return ledgerCreatedDate;
	}
	public void setLedgerCreatedDate(String ledgerCreatedDate) {
		this.ledgerCreatedDate = ledgerCreatedDate;
	}
	public int getLedgerTotalLoanAmount() {
		return ledgerTotalLoanAmount;
	}
	public void setLedgerTotalLoanAmount(int ledgerTotalLoanAmount) {
		this.ledgerTotalLoanAmount = ledgerTotalLoanAmount;
	}
	public double getLedgerPayableAmountWithInterest() {
		return ledgerPayableAmountWithInterest;
	}
	public void setLedgerPayableAmountWithInterest(double ledgerPayableAmountWithInterest) {
		this.ledgerPayableAmountWithInterest = ledgerPayableAmountWithInterest;
	}
	public int getLedgerTenure() {
		return ledgerTenure;
	}
	public void setLedgerTenure(int ledgerTenure) {
		this.ledgerTenure = ledgerTenure;
	}
	public double getLedgerMonthlyEmi() {
		return ledgerMonthlyEmi;
	}
	public void setLedgerMonthlyEmi(double ledgerMonthlyEmi) {
		this.ledgerMonthlyEmi = ledgerMonthlyEmi;
	}
	public String getLedgerAmountPaidTillDate() {
		return ledgerAmountPaidTillDate;
	}
	public void setLedgerAmountPaidTillDate(String ledgerAmountPaidTillDate) {
		this.ledgerAmountPaidTillDate = ledgerAmountPaidTillDate;
	}
	public int getLedgerRemainingAmount() {
		return ledgerRemainingAmount;
	}
	public void setLedgerRemainingAmount(int ledgerRemainingAmount) {
		this.ledgerRemainingAmount = ledgerRemainingAmount;
	}
	public String getLedgerNextEmiDate() {
		return ledgerNextEmiDate;
	}
	public void setLedgerNextEmiDate(String ledgerNextEmiDate) {
		this.ledgerNextEmiDate = ledgerNextEmiDate;
	}
	public String getLedgerEmiStatus() {
		return ledgerEmiStatus;
	}
	public void setLedgerEmiStatus(String ledgerEmiStatus) {
		this.ledgerEmiStatus = ledgerEmiStatus;
	}
	public String getLedgerCurrentMonthlyEmiStatus() {
		return ledgerCurrentMonthlyEmiStatus;
	}
	public void setLedgerCurrentMonthlyEmiStatus(String ledgerCurrentMonthlyEmiStatus) {
		this.ledgerCurrentMonthlyEmiStatus = ledgerCurrentMonthlyEmiStatus;
	}
	public String getLedgerLoanEndDate() {
		return ledgerLoanEndDate;
	}
	public void setLedgerLoanEndDate(String ledgerLoanEndDate) {
		this.ledgerLoanEndDate = ledgerLoanEndDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ledger [ledgerId=" + ledgerId + ", ledgerCreatedDate=" + ledgerCreatedDate + ", ledgerTotalLoanAmount="
				+ ledgerTotalLoanAmount + ", ledgerPayableAmountWithInterest=" + ledgerPayableAmountWithInterest
				+ ", ledgerTenure=" + ledgerTenure + ", ledgerMonthlyEmi=" + ledgerMonthlyEmi
				+ ", ledgerAmountPaidTillDate=" + ledgerAmountPaidTillDate + ", ledgerRemainingAmount="
				+ ledgerRemainingAmount + ", ledgerNextEmiDate=" + ledgerNextEmiDate + ", ledgerEmiStatus="
				+ ledgerEmiStatus + ", ledgerCurrentMonthlyEmiStatus=" + ledgerCurrentMonthlyEmiStatus
				+ ", ledgerLoanEndDate=" + ledgerLoanEndDate + ", status=" + status + "]";
	}
	
}
