package pmj.bj10.cloneable;

public class Customer implements Cloneable
{
   public Customer(String aName)   {
      name = aName;
      account = new BankAccount();
   }
   public String getName() {
      return name;
   }
   public BankAccount getAccount() {
       try {
           return (BankAccount) account.clone();
       }
       catch(Exception e) {
           return null;
       }
   }

   @Override
   public Customer clone()
   {
      try
      {
         Customer cloned = (Customer) super.clone();
         cloned.account = (BankAccount) account.clone();
         return cloned;
      }
      catch(CloneNotSupportedException e)
      {
         System.out.println("Customer: CloneNotSupportedException");
         return null;
      }
   }

   private String name;
   private BankAccount account;

}
