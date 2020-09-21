package com.smsnow.numbersearch.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.smsnow.numbersearch.model.Tfn;

public class TfnRowMapper implements RowMapper<Tfn> {

	@Override
	public Tfn mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Tfn tfn = new Tfn();
		tfn.setNpa(rs.getString("NPA"));
		tfn.setNxx(rs.getString("NXX"));
		tfn.setLine(rs.getString("LINE"));
		tfn.setStatus(rs.getString("STATUS"));
		tfn.setId(rs.getLong("id"));
		return tfn;
	}

}
