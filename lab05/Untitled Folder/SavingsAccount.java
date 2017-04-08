package accounts;

public class SavingsAccount extends BankAccount {  
	   public SavingsAccount(long acc_no,double rate)  {  
	        super(acc_no,0);
	        interestRate = rate;
	   }

	   public SavingsAccount(long acc_no,double initial_balance, double rate)  {  
	        super(acc_no,initial_balance);
	        interestRate = rate;
	   }

	   public void addInterest() {  
	      double interest = getBalance() * interestRate / 100;
	      deposit(interest); 
	   }
	   public String toString() {
	       return "Saving Account:\n" + "Account Number: " + return_account() +  "\nBalance: " + getBalance() + "\nInterest Rate " + interestRate;
	   }

	   private double interestRate;
	}
