package com.kogitolabs.boot.demo.wls1213;

import java.util.ArrayList;

public class Codebeautify {
	 AmendmentDto AmendmentDtoObject;


	 // Getter Methods 

	 public AmendmentDto getAmendmentDto() {
	  return AmendmentDtoObject;
	 }

	 // Setter Methods 

	 public void setAmendmentDto(AmendmentDto amendmentDtoObject) {
	  this.AmendmentDtoObject = amendmentDtoObject;
	 }
	}
	class AmendmentDto {
	 RequestCommonData RequestCommonDataObject;
	 RepresentativeIndividual RepresentativeIndividualObject;
	 ArrayList < Object > shareholderCompany = new ArrayList < Object > ();
	 private String companyNameEN;
	 private String companyNameAR;
	 private String workArea;
	 private String registrationType;
	 private float companyPercentage;
	 ArrayList < Object > directorBoard = new ArrayList < Object > ();
	 private String originCountry;
	 private String location;
	 private String position;
	 private String representativeName;
	 private String representativeNationality;
	 private String representativeId;
	 private String representativeContactNumber;
	 private float employeesNumber;
	 private String establishmentNumber;
	 private String establishmentNumberImmSys;
	 ArrayList < Object > iban = new ArrayList < Object > ();
	 private String bankStatementFileId;
	 ArrayList < Object > shareholderType = new ArrayList < Object > ();
	 private String representativeType;
	 private float numberOfLicenses;
	 ParentCompanyData ParentCompanyDataObject;
	 ArrayList < Object > tradeLicenseData = new ArrayList < Object > ();
	 ArrayList < Object > notes = new ArrayList < Object > ();


	 // Getter Methods 

	 public RequestCommonData getRequestCommonData() {
	  return RequestCommonDataObject;
	 }

	 public RepresentativeIndividual getRepresentativeIndividual() {
	  return RepresentativeIndividualObject;
	 }

	 public String getCompanyNameEN() {
	  return companyNameEN;
	 }

	 public String getCompanyNameAR() {
	  return companyNameAR;
	 }

	 public String getWorkArea() {
	  return workArea;
	 }

	 public String getRegistrationType() {
	  return registrationType;
	 }

	 public float getCompanyPercentage() {
	  return companyPercentage;
	 }

	 public String getOriginCountry() {
	  return originCountry;
	 }

	 public String getLocation() {
	  return location;
	 }

	 public String getPosition() {
	  return position;
	 }

	 public String getRepresentativeName() {
	  return representativeName;
	 }

	 public String getRepresentativeNationality() {
	  return representativeNationality;
	 }

	 public String getRepresentativeId() {
	  return representativeId;
	 }

	 public String getRepresentativeContactNumber() {
	  return representativeContactNumber;
	 }

	 public float getEmployeesNumber() {
	  return employeesNumber;
	 }

	 public String getEstablishmentNumber() {
	  return establishmentNumber;
	 }

	 public String getEstablishmentNumberImmSys() {
	  return establishmentNumberImmSys;
	 }

	 public String getBankStatementFileId() {
	  return bankStatementFileId;
	 }

	 public String getRepresentativeType() {
	  return representativeType;
	 }

	 public float getNumberOfLicenses() {
	  return numberOfLicenses;
	 }

	 public ParentCompanyData getParentCompanyData() {
	  return ParentCompanyDataObject;
	 }

	 // Setter Methods 

	 public void setRequestCommonData(RequestCommonData requestCommonDataObject) {
	  this.RequestCommonDataObject = requestCommonDataObject;
	 }

	 public void setRepresentativeIndividual(RepresentativeIndividual representativeIndividualObject) {
	  this.RepresentativeIndividualObject = representativeIndividualObject;
	 }

	 public void setCompanyNameEN(String companyNameEN) {
	  this.companyNameEN = companyNameEN;
	 }

	 public void setCompanyNameAR(String companyNameAR) {
	  this.companyNameAR = companyNameAR;
	 }

	 public void setWorkArea(String workArea) {
	  this.workArea = workArea;
	 }

	 public void setRegistrationType(String registrationType) {
	  this.registrationType = registrationType;
	 }

	 public void setCompanyPercentage(float companyPercentage) {
	  this.companyPercentage = companyPercentage;
	 }

	 public void setOriginCountry(String originCountry) {
	  this.originCountry = originCountry;
	 }

	 public void setLocation(String location) {
	  this.location = location;
	 }

	 public void setPosition(String position) {
	  this.position = position;
	 }

	 public void setRepresentativeName(String representativeName) {
	  this.representativeName = representativeName;
	 }

	 public void setRepresentativeNationality(String representativeNationality) {
	  this.representativeNationality = representativeNationality;
	 }

	 public void setRepresentativeId(String representativeId) {
	  this.representativeId = representativeId;
	 }

	 public void setRepresentativeContactNumber(String representativeContactNumber) {
	  this.representativeContactNumber = representativeContactNumber;
	 }

	 public void setEmployeesNumber(float employeesNumber) {
	  this.employeesNumber = employeesNumber;
	 }

	 public void setEstablishmentNumber(String establishmentNumber) {
	  this.establishmentNumber = establishmentNumber;
	 }

	 public void setEstablishmentNumberImmSys(String establishmentNumberImmSys) {
	  this.establishmentNumberImmSys = establishmentNumberImmSys;
	 }

	 public void setBankStatementFileId(String bankStatementFileId) {
	  this.bankStatementFileId = bankStatementFileId;
	 }

	 public void setRepresentativeType(String representativeType) {
	  this.representativeType = representativeType;
	 }

	 public void setNumberOfLicenses(float numberOfLicenses) {
	  this.numberOfLicenses = numberOfLicenses;
	 }

	 public void setParentCompanyData(ParentCompanyData parentCompanyDataObject) {
	  this.ParentCompanyDataObject = parentCompanyDataObject;
	 }
	}
	class ParentCompanyData {
	 private String companyNameAR;
	 private String companyNameEN;
	 private String workArea;
	 private String registrationType;
	 private float companyPercentage;
	 ArrayList < Object > directorBoard = new ArrayList < Object > ();
	 private String originCountry;
	 private String location;
	 private String position;
	 private String representativeName;
	 private String representativeNationality;
	 private String representativeId;
	 private String representativeContactNumber;
	 private float employeesNumber;
	 private String establishmentNumber;
	 private String establishmentNumberImmSys;
	 ArrayList < Object > iban = new ArrayList < Object > ();
	 private String bankStatementFileId;
	 private String offshoreContractMoUFileId;
	 private String offshoreContractArticlesOfAssociationsFileId;
	 private String legalPowerOfAttorneyFileId;
	 private String establishmentContractFileId;
	 private String boardOfDirectorsDecisionFileId;


	 // Getter Methods 

	 public String getCompanyNameAR() {
	  return companyNameAR;
	 }

	 public String getCompanyNameEN() {
	  return companyNameEN;
	 }

	 public String getWorkArea() {
	  return workArea;
	 }

	 public String getRegistrationType() {
	  return registrationType;
	 }

	 public float getCompanyPercentage() {
	  return companyPercentage;
	 }

	 public String getOriginCountry() {
	  return originCountry;
	 }

	 public String getLocation() {
	  return location;
	 }

	 public String getPosition() {
	  return position;
	 }

	 public String getRepresentativeName() {
	  return representativeName;
	 }

	 public String getRepresentativeNationality() {
	  return representativeNationality;
	 }

	 public String getRepresentativeId() {
	  return representativeId;
	 }

	 public String getRepresentativeContactNumber() {
	  return representativeContactNumber;
	 }

	 public float getEmployeesNumber() {
	  return employeesNumber;
	 }

	 public String getEstablishmentNumber() {
	  return establishmentNumber;
	 }

	 public String getEstablishmentNumberImmSys() {
	  return establishmentNumberImmSys;
	 }

	 public String getBankStatementFileId() {
	  return bankStatementFileId;
	 }

	 public String getOffshoreContractMoUFileId() {
	  return offshoreContractMoUFileId;
	 }

	 public String getOffshoreContractArticlesOfAssociationsFileId() {
	  return offshoreContractArticlesOfAssociationsFileId;
	 }

	 public String getLegalPowerOfAttorneyFileId() {
	  return legalPowerOfAttorneyFileId;
	 }

	 public String getEstablishmentContractFileId() {
	  return establishmentContractFileId;
	 }

	 public String getBoardOfDirectorsDecisionFileId() {
	  return boardOfDirectorsDecisionFileId;
	 }

	 // Setter Methods 

	 public void setCompanyNameAR(String companyNameAR) {
	  this.companyNameAR = companyNameAR;
	 }

	 public void setCompanyNameEN(String companyNameEN) {
	  this.companyNameEN = companyNameEN;
	 }

	 public void setWorkArea(String workArea) {
	  this.workArea = workArea;
	 }

	 public void setRegistrationType(String registrationType) {
	  this.registrationType = registrationType;
	 }

	 public void setCompanyPercentage(float companyPercentage) {
	  this.companyPercentage = companyPercentage;
	 }

	 public void setOriginCountry(String originCountry) {
	  this.originCountry = originCountry;
	 }

	 public void setLocation(String location) {
	  this.location = location;
	 }

	 public void setPosition(String position) {
	  this.position = position;
	 }

	 public void setRepresentativeName(String representativeName) {
	  this.representativeName = representativeName;
	 }

	 public void setRepresentativeNationality(String representativeNationality) {
	  this.representativeNationality = representativeNationality;
	 }

	 public void setRepresentativeId(String representativeId) {
	  this.representativeId = representativeId;
	 }

	 public void setRepresentativeContactNumber(String representativeContactNumber) {
	  this.representativeContactNumber = representativeContactNumber;
	 }

	 public void setEmployeesNumber(float employeesNumber) {
	  this.employeesNumber = employeesNumber;
	 }

	 public void setEstablishmentNumber(String establishmentNumber) {
	  this.establishmentNumber = establishmentNumber;
	 }

	 public void setEstablishmentNumberImmSys(String establishmentNumberImmSys) {
	  this.establishmentNumberImmSys = establishmentNumberImmSys;
	 }

	 public void setBankStatementFileId(String bankStatementFileId) {
	  this.bankStatementFileId = bankStatementFileId;
	 }

	 public void setOffshoreContractMoUFileId(String offshoreContractMoUFileId) {
	  this.offshoreContractMoUFileId = offshoreContractMoUFileId;
	 }

	 public void setOffshoreContractArticlesOfAssociationsFileId(String offshoreContractArticlesOfAssociationsFileId) {
	  this.offshoreContractArticlesOfAssociationsFileId = offshoreContractArticlesOfAssociationsFileId;
	 }

	 public void setLegalPowerOfAttorneyFileId(String legalPowerOfAttorneyFileId) {
	  this.legalPowerOfAttorneyFileId = legalPowerOfAttorneyFileId;
	 }

	 public void setEstablishmentContractFileId(String establishmentContractFileId) {
	  this.establishmentContractFileId = establishmentContractFileId;
	 }

	 public void setBoardOfDirectorsDecisionFileId(String boardOfDirectorsDecisionFileId) {
	  this.boardOfDirectorsDecisionFileId = boardOfDirectorsDecisionFileId;
	 }
	}
	class RepresentativeIndividual {
	 private String companyNameAR;
	 private String companyNameEN;
	 private String currentNationality;
	 private String previousNationality;
	 private String gender;
	 private String birthDate;
	 private String birthCountry;
	 private String birthCity;
	 ArrayList < Object > mobileNumber = new ArrayList < Object > ();
	 private String area;
	 private float udbNumber;
	 private String documentType;
	 private String documentNumber;
	 private String documentIssuePlace;
	 private String documentIssueDate;
	 private String documentExpiryDate;
	 private String documentCopyFileId;
	 private String residenceCopyFileId;
	 private String address;


	 // Getter Methods 

	 public String getCompanyNameAR() {
	  return companyNameAR;
	 }

	 public String getCompanyNameEN() {
	  return companyNameEN;
	 }

	 public String getCurrentNationality() {
	  return currentNationality;
	 }

	 public String getPreviousNationality() {
	  return previousNationality;
	 }

	 public String getGender() {
	  return gender;
	 }

	 public String getBirthDate() {
	  return birthDate;
	 }

	 public String getBirthCountry() {
	  return birthCountry;
	 }

	 public String getBirthCity() {
	  return birthCity;
	 }

	 public String getArea() {
	  return area;
	 }

	 public float getUdbNumber() {
	  return udbNumber;
	 }

	 public String getDocumentType() {
	  return documentType;
	 }

	 public String getDocumentNumber() {
	  return documentNumber;
	 }

	 public String getDocumentIssuePlace() {
	  return documentIssuePlace;
	 }

	 public String getDocumentIssueDate() {
	  return documentIssueDate;
	 }

	 public String getDocumentExpiryDate() {
	  return documentExpiryDate;
	 }

	 public String getDocumentCopyFileId() {
	  return documentCopyFileId;
	 }

	 public String getResidenceCopyFileId() {
	  return residenceCopyFileId;
	 }

	 public String getAddress() {
	  return address;
	 }

	 // Setter Methods 

	 public void setCompanyNameAR(String companyNameAR) {
	  this.companyNameAR = companyNameAR;
	 }

	 public void setCompanyNameEN(String companyNameEN) {
	  this.companyNameEN = companyNameEN;
	 }

	 public void setCurrentNationality(String currentNationality) {
	  this.currentNationality = currentNationality;
	 }

	 public void setPreviousNationality(String previousNationality) {
	  this.previousNationality = previousNationality;
	 }

	 public void setGender(String gender) {
	  this.gender = gender;
	 }

	 public void setBirthDate(String birthDate) {
	  this.birthDate = birthDate;
	 }

	 public void setBirthCountry(String birthCountry) {
	  this.birthCountry = birthCountry;
	 }

	 public void setBirthCity(String birthCity) {
	  this.birthCity = birthCity;
	 }

	 public void setArea(String area) {
	  this.area = area;
	 }

	 public void setUdbNumber(float udbNumber) {
	  this.udbNumber = udbNumber;
	 }

	 public void setDocumentType(String documentType) {
	  this.documentType = documentType;
	 }

	 public void setDocumentNumber(String documentNumber) {
	  this.documentNumber = documentNumber;
	 }

	 public void setDocumentIssuePlace(String documentIssuePlace) {
	  this.documentIssuePlace = documentIssuePlace;
	 }

	 public void setDocumentIssueDate(String documentIssueDate) {
	  this.documentIssueDate = documentIssueDate;
	 }

	 public void setDocumentExpiryDate(String documentExpiryDate) {
	  this.documentExpiryDate = documentExpiryDate;
	 }

	 public void setDocumentCopyFileId(String documentCopyFileId) {
	  this.documentCopyFileId = documentCopyFileId;
	 }

	 public void setResidenceCopyFileId(String residenceCopyFileId) {
	  this.residenceCopyFileId = residenceCopyFileId;
	 }

	 public void setAddress(String address) {
	  this.address = address;
	 }
	}
	class RequestCommonData {
	 private String requestSourceId;


	 // Getter Methods 

	 public String getRequestSourceId() {
	  return requestSourceId;
	 }

	 // Setter Methods 

	 public void setRequestSourceId(String requestSourceId) {
	  this.requestSourceId = requestSourceId;
	 }
	}