package accounts;

public class CheckingAccount extends BankAccount
{  
   /**
      Constructs a checking account with a given balance.
      @param initialBalance the initial balance
   */
   public CheckingAccount(long acc_no,double initialBalance)
   {  
      // Construct superclass
      super(acc_no,initialBalance);
      
      // Initialize transaction count
      transactionCount = 0; 
   }

   public void deposit(double amount) 
   {  
      transactionCount++;
      // Now add amount to balance 
      super.deposit(amount); 
   }
   
   public void withdraw(double amount) 
   {  
      transactionCount++;
      // Now subtract amount from balance 
      super.withdraw(amount); 
   }

   /**
      Deducts the accumulated fees and resets the
      transaction count.
   */
   public void deductFees()
   {  
      if (transactionCount > FREE_TRANSACTIONS)
      {  
         double fees = TRANSACTION_FEE *
               (transactionCount - FREE_TRANSACTIONS);
         super.withdraw(fees);
      }
      transactionCount = 0;
   }

   public String toString() {
       return "Checking Account:\n" + "Account number: " + return_account() + "\nBalance: " + getBalance() + "\nTransactions " + transactionCount;
   }

   private int transactionCount;

   private static final int FREE_TRANSACTIONS = 3;
   private static final double TRANSACTION_FEE = 2.0;
}