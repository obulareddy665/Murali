package com.iq.patient.managemant.api.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.iq.patient.managemant.api.PatientEnum;
import com.iq.patient.managemant.api.bean.PatientUnits;
import com.iq.patient.managemant.api.constant.PatientConstant;
import com.iq.patient.managemant.api.dao.PatientManagementDao;
import com.iq.patient.managemant.api.exception.PatientManagementException;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class PatientManagementDaoImpl implements PatientManagementDao{

	@Autowired
	private JdbcOperations jdbcOperations;
	
	@Override
	public List<PatientUnits> getPatientUnits() throws PatientManagementException  {
		
		
		try {
		return jdbcOperations.query(PatientEnum.GET_PATIENT_UNITS.getQry(), 
				(ResultSet rs, int rowNum) ->{
					PatientUnits patientUnits=new PatientUnits();
					patientUnits.setPatientUnitId(rs.getString(PatientConstant.patientUnitId));
					patientUnits.setPatientUnitName(rs.getString(PatientConstant.patientUnitName));
					return patientUnits;
					});
		}catch (Exception e) {
			log.debug("Entering into getPatientUnits():: Data");
			throw new PatientManagementException(e.getMessage());
		}
					
		
	}
	
	
	

}
