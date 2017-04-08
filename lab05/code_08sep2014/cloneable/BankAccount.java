package pmj.bj10.cloneable;

public class BankAccount implements Cloneable
{  
   public BankAccount() {
      balance = 0;
   }

   public BankAccount(double initialBalance) {
      balance = initialBalance;
   }

   public void deposit(double amount){  
      double newBalance = balance + amount;
      balance = newBalance;
   }

   public void withdraw(double amount){
      double newBalance = balance - amount;
      balance = newBalance;
   }

   public double getBalance()   {
      return balance;
   }

   @Override
   public Object clone() {
       try {
            return super.clone();
       }
       catch (CloneNotSupportedException e) {
           System.out.println("BankAccount: CloneNotSupportedException");
           return null;
       }
   }

   private double balance;
}
