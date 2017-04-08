package lab06;

import java.util.Scanner;
public class PollSimulator_new {

	public static void main(String[] args) {							// MAIN FUNCTION
		String[] candNames = new String[5];
		candNames[0] = "Deep Goyal";
		candNames[1] = "Sneha Mohan";
		candNames[2] = "Praveen Shah";
		candNames[3] = "Akshay Singh";
		candNames[4] = "Somin Majumdar";
		
		PollDBextended poll_db = new PollDBextended( candNames );		// CREATING OBJECT
		
for(int j=0;j<5;j++)
{
System.out.println(" \n Now contesting poll for: " + poll_db.pos.get(j));
System.out.println(" vote for candidate 1,2,3,4,5 \n enter respective numbers to vote for candidate number\n ");
		for(int i=0;i<10;i++)
		{
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			poll_db.voteTo(n);											// CASTING VOTE
		}
		for(int i = 1; i <= poll_db.getNumberOfCandidates(); i++ )
		{
			System.out.println(poll_db.getCandidateName(i)+ ": " + poll_db.votesCount(i));
		}
		System.out.println("The new: " + poll_db.pos.get(j)+ " is: " + poll_db.getWinner());	// GETTING WINNER
	
		poll_db.reset();												// FUNCTION CALL TO RESET VOTE COUNTER
		
	}		
}
}
// END OF CLASS