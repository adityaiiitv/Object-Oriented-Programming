package accounts;

public class Account_Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank accountlist=new Bank();
		
		accountlist.open(new SavingsAccount(1000,2));
		accountlist.open(new SavingsAccount(1001,3));
		accountlist.open(new SavingsAccount(1002,10000,4));
		accountlist.open(new SavingsAccount(1003,2000,6));
		accountlist.open(new SavingsAccount(1004,100,5));
		
		BankAccount b1=new BankAccount();
		b1=accountlist.close(1000);
		// Account Removed 
		System.out.print("Account Removed:\n");
		System.out.print(b1.toString());
		
		System.out.print("\n\n");
		
		System.out.print("\nAccount search for account no. 1004: \n");
		System.out.print(accountlist.find(1004));
		System.out.print("\n\nAccount search for account no. 1000: \n");
		System.out.print(accountlist.find(1000));
		
		accountlist.open(new CheckingAccount(1005,30000));
		accountlist.open(new CheckingAccount(1006,40000));
		accountlist.open(new CheckingAccount(1007,50000));
		accountlist.open(new CheckingAccount(1008,60000));
		accountlist.open(new CheckingAccount(1009,70000));
		accountlist.open(new SavingsAccount(1010,80000,10));
		System.out.print("\n\n");
		accountlist.find(1002).withdraw(5000);
		System.out.print("\nAccount Balance after Withdrawl\n");
		System.out.print(accountlist.find(1002));
		accountlist.find(1005).withdraw(100);
		System.out.print("\n\nAccount Balance after Withdrawl\n");
		System.out.print(accountlist.find(1005));
		
		System.out.print("\n\n");
		accountlist.find(1001).deposit(2500);
		System.out.print("\nAccount Balance after deposition\n");
		System.out.print(accountlist.find(1001));
		
		accountlist.find(1006).deposit(2000);
		System.out.print("\n\nAccount Balance after deposition\n");
		System.out.print(accountlist.find(1006));
		
		System.out.print("\n\n");
		
		System.out.print("\nAccount Balance before adding Interest\n");
		System.out.print(accountlist.find(1004));
		((SavingsAccount) accountlist.find(1004)).addInterest();
		System.out.print("\n\nAccount Balance after adding Interest\n");
		System.out.print(accountlist.find(1004));
		
		System.out.print("\n\n");
		
		System.out.print("\nAccount Balance before Deducting charges\n");
		System.out.print(accountlist.find(1007));
		((CheckingAccount) accountlist.find(1007)).deductFees();
		System.out.print("\n\nAccount Balance after adding Interest\n");
		System.out.print(accountlist.find(1007));
		
		System.out.print("\n\n");
		System.out.print("Account Balance for last account: ");
		System.out.print(accountlist.find(1010).getBalance());
		System.out.print("\n\nAccount Balance for first Account: ");
		System.out.print(accountlist.find(1001).getBalance());
		
		System.out.print("\n\n");
		
		Object b2=new BankAccount();
		b2=accountlist.find(1006).clone();
		System.out.print("\nOriginal Variable: \n");
		System.out.print(accountlist.find(1006));
		System.out.print("\n\nClone Object: \n");
		System.out.print(b2);
		
		System.out.print("\nAre two accounts equal: ");
		System.out.print(accountlist.find(1008).equals(1007));
		System.out.print("\nExpected: False\n");
		
		System.out.print("Are two accounts equal: ");
		Object b3=new BankAccount();
		b3=accountlist.find(1010).clone();
		System.out.print(accountlist.find(1010).equals((BankAccount)b3));
		System.out.print("\nExpected: True\n");
	}
}

