package com.iq.patient.managemant.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.iq.patient.managemant.api.bean.PatientUnits;
import com.iq.patient.managemant.api.exception.PatientManagementException;


public interface PatientManagementDao {
	
	public List<PatientUnits> getPatientUnits() throws PatientManagementException;

	
	
}
