package pmj.bj10.cloneable;

public class AccountTester
{
   public static void main(String[] args)
   {

     Customer c = new Customer("ABC");

     Customer c1 = c.clone();

     System.out.println("C1: " + c.getAccount().getBalance());

   }
}
