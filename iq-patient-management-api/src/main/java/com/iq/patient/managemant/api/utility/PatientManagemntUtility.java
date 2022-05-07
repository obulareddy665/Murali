package com.iq.patient.managemant.api.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.iq.patient.managemant.api.bean.PatientManagementInformation;
import com.iq.patient.managemant.api.bean.ServiceMessage;
import com.iq.patient.managemant.api.constant.PatientConstant;

public class PatientManagemntUtility {

	public static ServiceMessage responseSuccess(String type) {
		ServiceMessage serviceMessage = new ServiceMessage();
		serviceMessage.setCode(PatientConstant.SUCCESS_CODE);
		serviceMessage.setType(type);
		serviceMessage.setDescription(PatientConstant.SUCCESS_DESCRIPTION);
		return serviceMessage;
	}

	public static ResponseEntity<PatientManagementInformation> responseForNotFound(
			PatientManagementInformation patientManagementInformation) {
		ServiceMessage serviceMessage = new ServiceMessage();
		serviceMessage.setCode(PatientConstant.NOT_FOUND_CODE);
		serviceMessage.setType(PatientConstant.NOT_FOUND_TYPE);
		serviceMessage.setDescription(PatientConstant.NOT_FOUND_DESCRIPTION);
		patientManagementInformation.setServiceMessage(serviceMessage);
		return new ResponseEntity<PatientManagementInformation>(patientManagementInformation,
				HttpStatus.NOT_FOUND);
	}
	
	public static ResponseEntity<PatientManagementInformation> responseInternalError
	(PatientManagementInformation patientManagementInformation){
		ServiceMessage serviceMessage = new ServiceMessage();
		serviceMessage.setCode(PatientConstant.INTERNAL_SERVER_CODE);
		serviceMessage.setType(PatientConstant.INTERNAL_SERVER_TYPE);
		serviceMessage.setDescription(PatientConstant.INTERNAL_SERVER_DESCRIPTION);
		patientManagementInformation.setServiceMessage(serviceMessage);
		return new ResponseEntity<PatientManagementInformation>(patientManagementInformation,
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
