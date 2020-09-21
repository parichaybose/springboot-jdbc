package com.smsnow.numbersearch.model;

public class Tfn {
	
	private String npa;
	private String nxx;
	private String line;
	private String status;
	private long id;
	
	public String getNpa() {
		return npa;
	}
	public void setNpa(String npa) {
		this.npa = npa;
	}
	public String getNxx() {
		return nxx;
	}
	public void setNxx(String nxx) {
		this.nxx = nxx;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Tfn [npa=" + npa + ", nxx=" + nxx + ", line=" + line + ", status=" + status + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	

}
