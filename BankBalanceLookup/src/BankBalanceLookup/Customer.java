package BankBalanceLookup;

import java.io.Serializable;

public class Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Id;
	private String fName;
	private String lName;
	private double balance;
	
	public Customer(){
		
	}
	

	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

	public Customer(String id, String first, String last, double bal) {
		
		this.Id = id;
		this.fName = first;
		this.lName = last;
		this.balance = bal;
		
		
	}


}
