package com.iq.patient.managemant.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.iq.patient.managemant.api.bean.PatientManagementInformation;
import com.iq.patient.managemant.api.bean.PatientManagementResponse;
import com.iq.patient.managemant.api.bean.PatientUnits;
import com.iq.patient.managemant.api.bean.ServiceMessage;
import com.iq.patient.managemant.api.constant.PatientConstant;
import com.iq.patient.managemant.api.dao.PatientManagementDao;
import com.iq.patient.managemant.api.exception.PatientManagementException;
import com.iq.patient.managemant.api.service.PatientmanagementService;
import com.iq.patient.managemant.api.utility.PatientManagemntUtility;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PatientmanagementServiceImpl implements PatientmanagementService {

	@Autowired
	private PatientManagementDao patientManagementDao;
	
	
	public  List<PatientUnits> getPatientUnits() throws PatientManagementException {
		return patientManagementDao.getPatientUnits();
	}


}
