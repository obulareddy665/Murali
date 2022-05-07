package com.iq.patient.managemant.api.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ServiceMessage {

	private String type;
	
	private String code;
	
	private String description;
}
