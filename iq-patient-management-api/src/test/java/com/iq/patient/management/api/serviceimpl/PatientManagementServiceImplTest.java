package com.iq.patient.management.api.serviceimpl;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.iq.patient.managemant.api.dao.impl.PatientManagementDaoImpl;
import com.iq.patient.managemant.api.serviceImpl.PatientmanagementServiceImpl;

@ExtendWith(MockitoExtension.class)
public class PatientManagementServiceImplTest {

	@Mock
	private PatientManagementDaoImpl patientManagementDaoImpl;
	
	@InjectMocks
	private PatientmanagementServiceImpl patientmanagementServiceImpl;
	
	
}
