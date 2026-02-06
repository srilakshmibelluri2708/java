package com.tnsif.intro.bank;

public class BankDetails {
	 private String BankName;
	  private int AccountNumber;
	  private int AccountBalance;
	  public void setName(String name) {
		  this.BankName=name;
	  }
	  public String getName() {
		  return BankName;
	  }
	  public void setAccountNumber(int AccountNumber) {
		  this.AccountNumber=AccountNumber;
	  }
	  public int getAccountNumber() {
		  return AccountNumber;
	  }
	  public void setAccountBalance(int AccountBalance) {
		  this.AccountBalance=AccountBalance;
	  }
	  public int getAccountBalance() {
		  return AccountBalance;
	  }
	  
	  public static void main(String [] args) {
		  BankDetails th=new BankDetails ();
		  th.setName("SBI");
		  System.out.println("BankName:"+ th.getName());
		  th.setAccountNumber(19864);
		  System.out.println("AccountNumber:"+ th.getAccountNumber());
		  th.setAccountBalance(50000);
		  System.out.println("AccountNumber:"+ th.getAccountBalance());
	  }
	}

