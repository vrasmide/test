package com.bankAccount;

public interface BankAccountService {
	
	public double withdraw(long accountId, double balance);
	public double deposit(long accountId, double balance);
	public double getBalanace(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount,double amount);

}
