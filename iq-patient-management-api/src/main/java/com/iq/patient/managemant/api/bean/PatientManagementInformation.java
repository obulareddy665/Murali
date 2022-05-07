package com.iq.patient.managemant.api.bean;

import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@JsonInclude(value = Include.NON_NULL)
public class PatientManagementInformation {

	
	private ServiceMessage serviceMessage;
	
	private PatientManagementResponse patientManagementResponse;
}
