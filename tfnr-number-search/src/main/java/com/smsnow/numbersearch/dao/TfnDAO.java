package com.smsnow.numbersearch.dao;

import com.smsnow.numbersearch.model.Tfn;

public interface TfnDAO {
	public abstract void createTfn(Tfn tfn);
	public abstract Tfn getTfn(Tfn tfn);
	public abstract void updateTfn(Tfn tfn);
	public abstract void deleteTfn(Tfn tfn);
}
