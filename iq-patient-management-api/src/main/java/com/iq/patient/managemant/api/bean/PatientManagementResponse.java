package com.iq.patient.managemant.api.bean;

import java.util.List;

import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class PatientManagementResponse {

	private Integer patientUnitSize;

	private List<PatientUnits> patientUnits;

}
