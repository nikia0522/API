package com.hanbit.oop.serviceImpl;

import java.util.Calendar;
import java.util.Vector;

import com.hanbit.oop.domain.BankBean;
import com.hanbit.oop.service.BankService;

public class BankServiceImpl implements BankService{
	int count;
	BankBean bank;
	BankBean[] list;
	Vector<BankBean> vec;
	public BankServiceImpl(){
		vec=new Vector<BankBean>(10,10);
	}
	@Override
	public void openAccount(BankBean bank) {
		//계좌계설
		vec.add(bank);
		int randomNo=(int)(Math.random()*99999999+10000000);
		bank.setAccount(randomNo);
		Calendar now=Calendar.getInstance();
		int yy=now.get(now.YEAR);
		int mm=now.get(now.MONTH)+1;
		int dd=now.get(now.DAY_OF_MONTH);
		String date=String.valueOf(yy+"년"+mm+"월"+dd+"일");
		bank.setTxDate(date);
	}

	@Override
	public Vector<BankBean> listAccount() {
		// 계좌 전체 목록
		return vec;
	}

	@Override
	public Vector<BankBean> findByName(String name) {
		// 이름 검색(동명이인 허용)
		Vector<BankBean> temp=new Vector<>(10,10);
		for(int i=0; i<vec.size();i++){
			if(name.equals(vec.get(i).getName())){
				temp.add(bank);
			}
		}	
		return temp;
	}

	@Override
	public BankBean findByAccount(int account) {
		bank=new BankBean();
		for(int i=0; i<vec.capacity();i++){
			if(account==vec.indexOf(i)){
				bank=vec.get(i);
				break;
			}
		}
		return bank;
	}

	@Override
	public int countAccount() {		
		return vec.size();
	}

	@Override
	public void updatePassword(BankBean bank) {
		findByAccount(bank.getAccount());
		if(bank.getAccount()==(bank.getAccount())){
			bank.setPassword(bank.getPassword());
		}
		
	}

	@Override
	public void deposit(BankBean bank) {
		findByAccount(bank.getAccount());
		if(bank.getAccount()==(bank.getAccount())){
			bank.setDeposit
		}
	}

	@Override
	public void withdrawal(BankBean bank) {

	}

	@Override
	public void deleteAccount(int account) {
		if (vec.contains(account)){
			vec.remove(account);
		}
	}
}	


