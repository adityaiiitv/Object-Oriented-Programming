package accounts;

import java.util.ArrayList;

public class Bank {

	ArrayList<BankAccount> account=new ArrayList<BankAccount>();
	public long open(BankAccount Bank_account)
	{
		account.add(Bank_account);
		return Bank_account.return_account();
	}
	public BankAccount find(long acc_no)
	{
		int i,n=0,flag=0;
		for(i=0;i<account.size();i++)
		{
			if(account.get(i).return_account()==acc_no)
			{
				flag=1;
				n=i;
			}
		}
		if(flag==1)
		{
			return account.get(n);
		}
		else 
			return null;
	}
	
	public BankAccount close(long acc_no)
	{
		int i,n=0,flag=0;
		for(i=0;i<account.size();i++)
		{
			if(account.get(i).return_account()==acc_no)
			{
				n=i;
				flag=1;
			}
		}
		if(flag==1)
		{
			BankAccount b1=new BankAccount();
			b1=account.get(n);
			account.remove(n);
			return b1;
		}
		else
			return null;
		}
}

