package com.hanbit.oop.domain;
public class BankBean {
	private String name, password, id, txDate, ssn;
	private int account, deposit;
	public static final String BANK_NAME="KB 국민은행";
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAccount(int account){
		this.account=account;
	}
	public int getAccount(){
		return account;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setDeposit(int deposit){
		this.deposit=deposit;
	}
	public int getDeposit(){
		return deposit;
	}
	public void setTxDate(String txDate){
		this.txDate=txDate;
	}
	public String getDate(){
		return txDate;
	}
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public String toString(){
		return String.format("계좌정보[이름: %s, 번호: %d, 잔액: %d  날짜: %s]\n", name, account, deposit,txDate);
	}
}
