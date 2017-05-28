package com.bookStore.Domain;
// Generated 2017-5-26 21:04:32 by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Products generated by hbm2java
 */
public class Products implements java.io.Serializable {

	private static final long serialVersionUID = -3360156629408212963L;
	private Integer id;
	private Sort sort;
	private String pname;
	private double pvalue;
	private int pnumber;
	private int sid;
	private Set indents = new HashSet(0);

	public Products() {
	}

	public Products(Sort sort, String pname, double pvalue, int pnumber, int sid) {
		this.sort = sort;
		this.pname = pname;
		this.pvalue = pvalue;
		this.pnumber = pnumber;
		this.sid = sid;
	}

	public Products(Sort sort, String pname, double pvalue, int pnumber, int sid, Set indents) {
		this.sort = sort;
		this.pname = pname;
		this.pvalue = pvalue;
		this.pnumber = pnumber;
		this.sid = sid;
		this.indents = indents;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Sort getSort() {
		return this.sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPvalue() {
		return this.pvalue;
	}

	public void setPvalue(double pvalue) {
		this.pvalue = pvalue;
	}

	public int getPnumber() {
		return this.pnumber;
	}

	public void setPnumber(int pnumber) {
		this.pnumber = pnumber;
	}

	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Set getIndents() {
		return this.indents;
	}

	public void setIndents(Set indents) {
		this.indents = indents;
	}

}