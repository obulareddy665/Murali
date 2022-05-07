package com.iq.patient.managemant.api;

public enum PatientEnum {

	GET_PATIENT_UNITS("select patientUnitId,patientUnitName "
			+ " from patient_management.pateint_units;");
	
	private String qry;

	private PatientEnum(String qry) {
		this.qry = qry;
	}

	public String getQry() {
		return qry;
	}
	
	
}
