package com.hanbit.oop.service;

import java.util.Vector;

import com.hanbit.oop.domain.BankBean;

public interface BankService {
	public void openAccount(BankBean bank);
	public Vector<BankBean> listAccount();
	public Vector<BankBean> findByName(String name);
	public BankBean findByAccount(int account);
	public int countAccount();
	public void updatePassword(BankBean bank);
	public void deposit(BankBean bank);
	public void withdrawal(BankBean bank);
	public void deleteAccount(int delAccount);
}
