package com.smsnow.numbersearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smsnow.numbersearch.dao.TfnDAO;
import com.smsnow.numbersearch.model.Tfn;

@SpringBootApplication
public class TfnrNumberSearchApplication implements CommandLineRunner {
	
	@Autowired
	TfnDAO tfnDAO;

	public static void main(String[] args) {
		SpringApplication.run(TfnrNumberSearchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//createTfn();
		//updateTfn();
		//getTfn();
		deleteTfn();
	}

	private void deleteTfn() {
		// TODO Auto-generated method stub
		Tfn tfn = new Tfn();
		tfn.setId(1);
		
		tfnDAO.deleteTfn(tfn);		
	}

	private void getTfn() {
		// TODO Auto-generated method stub
		Tfn tfn = new Tfn();
		tfn.setNpa("123");
		tfn.setNxx("456");
		tfn.setLine("7890");
		
		System.out.println(tfnDAO.getTfn(tfn).toString());
		
	}

	private void updateTfn() {
		// TODO Auto-generated method stub
		Tfn tfn = new Tfn();
		tfn.setNpa("123");
		tfn.setNxx("456");
		tfn.setLine("7890");
		tfn.setStatus("RESERVED");
		
		tfnDAO.updateTfn(tfn);
		
	}

	private void createTfn() {
		// TODO Auto-generated method stub
		Tfn tfn = new Tfn();
		tfn.setNpa("123");
		tfn.setNxx("456");
		tfn.setLine("7890");
		tfn.setStatus("AVAILABLE");
		
		tfnDAO.createTfn(tfn);
		
	}

}
