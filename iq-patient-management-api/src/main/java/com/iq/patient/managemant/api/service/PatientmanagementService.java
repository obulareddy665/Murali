package com.iq.patient.managemant.api.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.iq.patient.managemant.api.bean.PatientManagementInformation;
import com.iq.patient.managemant.api.bean.PatientUnits;
import com.iq.patient.managemant.api.exception.PatientManagementException;

public interface PatientmanagementService {

	public List<PatientUnits> getPatientUnits() throws PatientManagementException;
}
