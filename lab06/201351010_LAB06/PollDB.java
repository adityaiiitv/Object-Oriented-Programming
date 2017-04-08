package lab06;

import java.util.ArrayList;
import java.util.Scanner;

public class PollDB {
	int[] count = new int[5];							// ARRAY TO COUNT NUMBER OF VOTES
	PollDB()
	{
		for(int i=0;i<5;i++)
		{count[i]=0;}
	
	}
	
	ArrayList<String> cand=new ArrayList<String>();		// ARRAY-LIST TO STORE THE CANDIDATES
	PollDB(String[] candNames)							// CONSTRUCTOR TO ADD NAMES
	{
		
		for(int i=0;i<5;i++)
		{
		cand.add(candNames[i]);
		}
	}
	
	int getNumberOfCandidates()							// FUNCTION TO GET NUMBER OF CANDIDATES
	{	
		return cand.size();
	}
	
	void voteTo(int v)									// FUNCTION TO CAST VOOTES
	{
		
		if(v==1)
		{count[0]++;}
		
		if(v==2)
		{count[1]++;}
		
		if(v==3)
		{count[2]++;}
		
		if(v==4)
		{count[3]++;}
		
		if(v==5)
		{count[4]++;}
		
	}
	
	
	String getCandidateName(int n)						// FUNCTION TO GET THE CANDIDATE NAME
	{
		String ch = cand.get(n-1);
		return ch;
	}
	
	int votesCount(int n)								// FUNCTION TO RETURN THE VOTES COUNT
	{
		return count[n-1];
	}
	
	String getWinner()									// FUNCTION TO RETURN THE WINNER NAME
	{
		int max=count[0];
		int p=0;
		for(int i=1;i<5;i++)
		{
			if(count[i]>max)
			{
				max=count[i];
				p=i;
			}
			
		}
		
		return cand.get(p);
	}
	
	int pass(int n)										// PASSWORD ENCRIPTION IN CLASS
	{	
		System.out.println(" enter the password ");
		Scanner input = new Scanner(System.in);
		int pass = input.nextInt();
		if(pass==123)
		{
			return 5;									// SUCCESSFUL CONDITION
		}
		else
		{												// FAILURE CONDITION
			return 0;
		}
	}
}
// END OF CLASS