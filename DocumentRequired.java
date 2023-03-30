package com.SecureHome.main.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DocumentRequired {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int documentId;
		@Lob
		private byte[] adharCard;
		@Lob
		private byte[] panCard;
		@Lob
		private byte[] last3MonthSalarySlip;
		@Lob
		private byte[] incomeCertificate;
		@Lob
		private byte[] propertyDocument;
		@Lob
		private byte[] bankCheque;
		@Lob
		private byte[] passportSizePhoto;
		@Lob
		private byte[] last6MonthBankStatement;
		public int getDocumentId() {
			return documentId;
		}
		public void setDocumentId(int documentId) {
			this.documentId = documentId;
		}
		public byte[] getAdharCard() {
			return adharCard;
		}
		public void setAdharCard(byte[] adharCard) {
			this.adharCard = adharCard;
		}
		public byte[] getPanCard() {
			return panCard;
		}
		public void setPanCard(byte[] panCard) {
			this.panCard = panCard;
		}
		public byte[] getLast3MonthSalarySlip() {
			return last3MonthSalarySlip;
		}
		public void setLast3MonthSalarySlip(byte[] last3MonthSalarySlip) {
			this.last3MonthSalarySlip = last3MonthSalarySlip;
		}
		public byte[] getIncomeCertificate() {
			return incomeCertificate;
		}
		public void setIncomeCertificate(byte[] incomeCertificate) {
			this.incomeCertificate = incomeCertificate;
		}
		public byte[] getPropertyDocument() {
			return propertyDocument;
		}
		public void setPropertyDocument(byte[] propertyDocument) {
			this.propertyDocument = propertyDocument;
		}
		public byte[] getBankCheque() {
			return bankCheque;
		}
		public void setBankCheque(byte[] bankCheque) {
			this.bankCheque = bankCheque;
		}
		public byte[] getPassportSizePhoto() {
			return passportSizePhoto;
		}
		public void setPassportSizePhoto(byte[] passportSizePhoto) {
			this.passportSizePhoto = passportSizePhoto;
		}
		public byte[] getLast6MonthBankStatement() {
			return last6MonthBankStatement;
		}
		public void setLast6MonthBankStatement(byte[] last6MonthBankStatement) {
			this.last6MonthBankStatement = last6MonthBankStatement;
		}
		@Override
		public String toString() {
			return "DocumentRequired [documentId=" + documentId + ", adharCard=" + Arrays.toString(adharCard)
					+ ", panCard=" + Arrays.toString(panCard) + ", last3MonthSalarySlip="
					+ Arrays.toString(last3MonthSalarySlip) + ", incomeCertificate="
					+ Arrays.toString(incomeCertificate) + ", propertyDocument=" + Arrays.toString(propertyDocument)
					+ ", bankCheque=" + Arrays.toString(bankCheque) + ", passportSizePhoto="
					+ Arrays.toString(passportSizePhoto) + ", last6MonthBankStatement="
					+ Arrays.toString(last6MonthBankStatement) + "]";
		}
		
}
