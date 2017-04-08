package pmj.bj10.accounts;
/**
   This program tests the BankAccount class and
   its subclasses. 
*/
public class AccountTester
{  
   public static void main(String[] args)
   {

       //SavingsAccount collegeFund = new SavingsAccount(10);
       Object x = new BankAccount(5000);
       System.out.println( x );

               //collegeFund;
  /*     Object anObject = collegeFund;

       anAccount.deposit(5000.0);
       String a = anObject.toString();

      SavingsAccount momsSavings 
            = new SavingsAccount(0.5);
      
      CheckingAccount harrysChecking
            = new CheckingAccount(100);
         
      momsSavings.deposit(10000);
      
      momsSavings.transferTo(2000, harrysChecking);
      harrysChecking.withdraw(1500);
      harrysChecking.withdraw(80);      

      momsSavings.transferTo(1000, harrysChecking);
      harrysChecking.withdraw(400);      

      // Simulate end of month
      momsSavings.addInterest();
      harrysChecking.deductFees();
      
      System.out.println("Mom's savings balance: "
            + momsSavings.getBalance());
      System.out.println("Expected: 7035");

      System.out.println("Harry's checking balance: "
            + harrysChecking.getBalance());
      System.out.println("Expected: 1116");
*/
      /*        BankAccount acc = new SavingsAccount(10);
        if (acc instanceof BankAccount )
            System.out.println("BankAccount");
        if (acc instanceof SavingsAccount )
            System.out.println("SavingsAccount");
 */
   }
}
