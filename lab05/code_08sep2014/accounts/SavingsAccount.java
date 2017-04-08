package pmj.bj10.accounts;

public class SavingsAccount extends BankAccount {  
   public SavingsAccount(double rate)  {  
        super(0);
        interestRate = rate;
   }

   public SavingsAccount(double initial_balance, double rate)  {  
        super(initial_balance);
        interestRate = rate;
   }

   public void addInterest() {  
      double interest = getBalance() * interestRate / 100;
      deposit(interest); 
   }
   public String toString() {
       return "Saving Account:\n   Balance: " + getBalance() + "\n   Interest Rate " + interestRate;
   }

   private double interestRate;
}
