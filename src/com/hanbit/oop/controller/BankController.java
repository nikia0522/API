package com.hanbit.oop.controller;

import java.util.Vector;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.BankBean;
import com.hanbit.oop.service.BankService;
import com.hanbit.oop.serviceImpl.BankServiceImpl;

public class BankController {
	public static void main(String[] args){
		BankService service=new BankServiceImpl();
		BankBean bank=new BankBean();
		while(true){
			switch(JOptionPane.showInputDialog("0.End  1.OpenAccount  2.ListAccount  3.FindByName  4.FindByAccount  5.count  6.UpdatePassword  7.UpdateDeposit  8.UpdateWithdrawal  9.DeleteAccount")){
			case "0": 
				JOptionPane.showMessageDialog(null, "end");
				return;				
			case "1":
				String[] info=JOptionPane.showInputDialog("이름/Id/Password/SSN/입금 금액").split("/");
				bank.setName(info[0]);
				bank.setId(info[1]);
				bank.setPassword(info[2]);
				bank.setSsn(info[3]);
				bank.setDeposit(Integer.parseInt(info[4]));
				service.openAccount(bank);
				JOptionPane.showMessageDialog(null, "계좌개설 성공!");
				break;				
			case "2":
				Vector<BankBean>vec=service.listAccount();
				JOptionPane.showMessageDialog(null, vec);
				break;
				
			case "3":
				Vector<BankBean>vec2=service.findByName(JOptionPane.showInputDialog("찾으실 이름을 입력을 입력하세요"));
				JOptionPane.showMessageDialog(null, vec2);
				break;
				
			case "4":
				service.findByAccount(Integer.parseInt(JOptionPane.showInputDialog("찾으실 계좌번호를 입력하세요")));
				JOptionPane.showMessageDialog(null, "");
				break;
				
			case "5":
				int count=service.countAccount();
				JOptionPane.showMessageDialog(null, "계좌수:");
				break;
				
			case "6":
				String[] pass=JOptionPane.showInputDialog("계좌번호/비밀번호").split("/");
				bank.setAccount(Integer.parseInt(pass[0]));
				bank.setPassword(pass[1]);			
				service.updatePassword(bank);
				JOptionPane.showMessageDialog(null, "비밀번호 변경 성공!");
				break;
				
			case "7":
				String[] depo=JOptionPane.showInputDialog("계좌번호/입금 금액").split("/");
				bank.setAccount(Integer.parseInt(depo[0]));
				bank.setDeposit(Integer.parseInt(depo[1]));
				service.deposit(bank);
				JOptionPane.showMessageDialog(null, "입금 성공!");
				break;
				
			case "8":
				String[] withd=JOptionPane.showInputDialog("계좌번호/출금 금액").split("/");
				bank.setAccount(Integer.parseInt(withd[0]));
				bank.setDeposit(Integer.parseInt(withd[1]));
				service.withdrawal(bank);
				JOptionPane.showMessageDialog(null, "출금 성공!");
				break;
				
			case "9":
				service.deleteAccount(Integer.parseInt(JOptionPane.showInputDialog("계좌번호")));
				JOptionPane.showMessageDialog(null, "해지 성공!");
				break;
			}

		}
	}
}
