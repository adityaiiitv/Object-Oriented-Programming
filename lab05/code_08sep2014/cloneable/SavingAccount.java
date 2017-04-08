package pmj.bj10.cloneable;

public class SavingAccount extends BankAccount
{
   public SavingAccount()   {
      interestRate = 0;
   }

   public SavingAccount(double rate)  {
      interestRate = rate;
   }

   public SavingAccount(double initial_balance, double rate)  {
      super(initial_balance);
      interestRate = rate;
   }

   public void addInterest() {
      double interest = getBalance() * interestRate / 100;
      deposit(interest);
   }

   private double interestRate;

}
