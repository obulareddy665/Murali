package com.iq.patient.management.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.anything;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.util.ReflectionUtils;

import com.iq.patient.managemant.api.bean.PatientUnits;
import com.iq.patient.managemant.api.constant.PatientConstant;
import com.iq.patient.managemant.api.dao.PatientManagementDao;
import com.iq.patient.managemant.api.dao.impl.PatientManagementDaoImpl;
import com.iq.patient.managemant.api.exception.PatientManagementException;

@ExtendWith(MockitoExtension.class)
public class PatientDaoTest {

	@Mock
	private JdbcOperations jdbcOperations;
	
	 @InjectMocks
	private PatientManagementDaoImpl patientManagementDaoImpl;


	@Test
	public void testPatientUnts() throws PatientManagementException {
		
		
		
		Mockito.when(jdbcOperations.query(ArgumentMatchers.anyString(), 
				ArgumentMatchers.any(RowMapper.class)))
		.thenAnswer((invocation)->{
			RowMapper<PatientUnits> rowMapper=(RowMapper<PatientUnits>) invocation.getArgument(1);
			ResultSet rs=Mockito.mock(ResultSet.class);
			
			Mockito.when(rs.getString(PatientConstant.patientUnitId)).thenReturn("rohit","rohit");
			Mockito.when(rs.getString(PatientConstant.patientUnitName)).thenReturn("rohit","rohit");
			List<PatientUnits> patientUnits=new ArrayList<>();
			patientUnits.add(rowMapper.mapRow(rs, 0));
			patientUnits.add(rowMapper.mapRow(rs, 1));
			return patientUnits;
			});
		List<PatientUnits> patientUnits=patientManagementDaoImpl.getPatientUnits();
		assertEquals(2, patientUnits.size());
		}
	
	
	
}
