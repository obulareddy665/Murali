package com.iq.patient.managemant.api.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@Getter
public class PatientManagementException extends Exception {

	private String message;
	
	public PatientManagementException(String message) {
		this.message=message;
	}
}
