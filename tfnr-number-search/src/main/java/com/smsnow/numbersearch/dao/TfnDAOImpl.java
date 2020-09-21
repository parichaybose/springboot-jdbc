package com.smsnow.numbersearch.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import static com.smsnow.numbersearch.TfnConstants.*;

import com.smsnow.numbersearch.model.Tfn;

@Repository
public class TfnDAOImpl implements TfnDAO {

	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public void createTfn(Tfn tfn) {
		// TODO Auto-generated method stub

		int update = jdbctemplate.update(CREATE_TFN_SQL, tfn.getNpa(), tfn.getNxx(), tfn.getLine(), tfn.getStatus());

		if (update > 0)
			System.out.println("Tfn created ..");

	}

	@Override
	public Tfn getTfn(Tfn tfn) {
		Tfn outTfn = jdbctemplate.queryForObject(GET_TFN_SQL, new TfnRowMapper(), tfn.getNpa(), tfn.getNxx(),
				tfn.getLine());
		return outTfn;
	}

	@Override
	public void updateTfn(Tfn tfn) {
		// TODO Auto-generated method stub
		int update = jdbctemplate.update(UPDATE_TFN_SQL, tfn.getStatus(), tfn.getNpa(), tfn.getNxx(), tfn.getLine() );

		if (update > 0)
			System.out.println("Tfn updated ..");

	}

	@Override
	public void deleteTfn(Tfn tfn) {
		// TODO Auto-generated method stub
		int delete = jdbctemplate.update(DELETE_TFN_SQL, tfn.getId());
		
		if (delete > 0)
			System.out.println("Tfn deleted ..");
	}

}
