package accounts;

public class BankAccount implements Cloneable
{  
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {  
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(long acc_no,double initialBalance)
   {  
	  account=acc_no;
      balance = initialBalance;
   }
 
   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount) 
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount) 
   {  
      balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {  
      return balance; 
   }
   public long return_account()
   {
	   return account;
   }
   
   /**
      Transfers money from the bank account to another account
      @param amount the amount to transfer
      @param other the other account
   */
   public void transferTo(double amount, BankAccount other)
   {  
      withdraw(amount);
      other.deposit(amount);
   }

   //@Override
   public String toString() {
       return "Account no: " + account + "Account Balance: " + balance;
   }
   //@Override
   public Object clone() {
       try {
            return super.clone();
       }
       catch (CloneNotSupportedException e) {
           System.out.println("BankAccount: CloneNotSupportedException");
           return null;
       }
   }
   
   //@Override
   public boolean equals(BankAccount obj)
   {
	   if(this.account==obj.return_account())
		   return true;
	   else 
		   return false;
   }

   private long account;
   private double balance;
}