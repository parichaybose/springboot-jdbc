package com.smsnow.numbersearch;

public class TfnConstants {
	
	public static final String CREATE_TFN_SQL = "INSERT INTO TFN(NPA, NXX, LINE, STATUS) VALUES (?,?,?,?)";
	public static final String UPDATE_TFN_SQL = "UPDATE TFN SET STATUS=? WHERE NPA=? AND NXX=? AND LINE=?";
	public static final String GET_TFN_SQL = "SELECT * FROM TFN WHERE NPA=? AND NXX=? AND LINE=?";
	public static final String DELETE_TFN_SQL = "DELETE FROM TFN WHERE id=?";

}
