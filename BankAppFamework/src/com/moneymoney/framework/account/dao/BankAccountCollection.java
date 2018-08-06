package com.moneymoney.framework.account.dao;

import java.util.HashSet;
import java.util.Set;

import com.moneymoney.framework.account.pojo.BankAccount;

/**
 * @author Satyen Singh
 *
 *This is class for maintianing the list of all unique account objects.
 *
 *This was created from the warm heart. The Developers are From capgemini.
 */
public abstract class BankAccountCollection {
	private static Set<BankAccount> bankAccountSet;
	
	static {
		bankAccountSet = new HashSet<>();
	}
	
	/**
	 * @param bankAccount
	 * 
	 * This method takes account object and adds it in the database
	 */
	public void addBankAccount(BankAccount bankAccount) {
		bankAccountSet.add(bankAccount);
	}
	
	/**
	 * @return Set of Accounts
	 * 
	 * This method is responsible for returning all the active accounts
	 */
	public Set<BankAccount> viewAll(){
		return bankAccountSet;
	}
}
