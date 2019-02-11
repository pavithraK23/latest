package com.cg.oiqgs.dao;

public interface QueryMapper {

	public static final String InsertQuery = "INSERT into accounts values(account_number_seq.nextval,?,?,?,?,?,?)";
	public static final String selectAllPolicies = "select * from policy p ,accounts a where p.account_number =a.account_number and a.username=?";
	public static final String validateDetails = "select * from accounts";
	public static final String viewAccount = "select account_number_seq.nextval from accounts ";
}
