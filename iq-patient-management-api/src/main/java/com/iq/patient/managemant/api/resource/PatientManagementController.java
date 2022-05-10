package com.iq.patient.managemant.api.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iq.patient.managemant.api.bean.PatientManagementInformation;
import com.iq.patient.managemant.api.bean.PatientManagementResponse;
import com.iq.patient.managemant.api.bean.PatientUnits;
import com.iq.patient.managemant.api.bean.ServiceMessage;
import com.iq.patient.managemant.api.constant.PatientConstant;
import com.iq.patient.managemant.api.exception.PatientManagementException;
import com.iq.patient.managemant.api.service.PatientmanagementService;
import com.iq.patient.managemant.api.utility.PatientManagemntUtility;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1")
@Slf4j
public class PatientManagementController {

	@Autowired
	private PatientmanagementService patientmanagementService;
	
	

	@GetMapping(value = "/patient/patientunits")
	public ResponseEntity<PatientManagementInformation> getPatientUnits() throws PatientManagementException {
		PatientManagementInformation patientManagementInformation=new PatientManagementInformation();
		PatientManagementResponse patientManagementResponse=new PatientManagementResponse();
		ServiceMessage serviceMessage=new ServiceMessage();
		try {
		
	List<PatientUnits> patientUnits=patientmanagementService.getPatientUnits();
	
	if(!(patientUnits.isEmpty())) {
	patientManagementResponse.setPatientUnits(patientUnits);
	patientManagementResponse.setPatientUnitSize(patientUnits.size());
	patientManagementInformation.setPatientManagementResponse(patientManagementResponse);
	serviceMessage=PatientManagemntUtility.responseSuccess(PatientConstant.SUCCESS_TYPE);
	patientManagementInformation.setServiceMessage(serviceMessage);
	}else {
		return PatientManagemntUtility.responseForNotFound(patientManagementInformation);
	}
		}catch (Exception e) {
			log.info("getBusinessUnits()::"+e.getMessage());
			return PatientManagemntUtility.responseInternalError(patientManagementInformation);
			
		}
		return new ResponseEntity<PatientManagementInformation>(patientManagementInformation,HttpStatus.OK);
	}


	public String getUser() {
		return "";
	}

	
	
	
	
}
