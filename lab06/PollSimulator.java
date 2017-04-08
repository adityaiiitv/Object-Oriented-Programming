package lab06;
//import java.util.Random;
import java.util.Scanner;
public class PollSimulator {								// CLASS DECLARATION
	public static void main(String[] args) {				// MAIN FUNCTION
		String[] candNames = new String[5];
		candNames[0] = "Deep Goyal";
		candNames[1] = "Sneha Mohan";
		candNames[2] = "Praveen Shah";
		candNames[3] = "Akshay Singh";
		candNames[4] = "Somin Majumdar";
		
		PollDB poll_db = new PollDB( candNames );			// CREATING NEW OBJECT
		/*													// FIRST TWO PARTS OF QUESTION IN COMMENTS
		int nc = poll_db.getNumberOfCandidates();
		
		Random rand = new Random(55);
		for( int i = 1; i <=50; i++ ) {
		int x = 1 + rand.nextInt(nc);
		poll_db.voteTo( x );
		} //Assume that candidates are identified as 1 through 5
		//Report the election result
		 * 
		 */
		for(int i=0;i<10;i++)								// CASTING VOTES
		{
			System.out.println(" vote for candidate 1,2,3,4,5 \n enter respective numbers ");
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			poll_db.voteTo(n);
		}
		
		int n=3,flag;
		while(n!=0)											// PASSWORD PROTECTION, PROMPTS FOR 3 TIMES
		{
		flag=poll_db.pass(n);
		
		if(flag==5)											// CORRECT PASSWORD CONDITION
		{
			
			for(int i = 1; i <= poll_db.getNumberOfCandidates(); i++ )
			{
				System.out.println(poll_db.getCandidateName(i)+ ": " + poll_db.votesCount(i));		// COUNTING VOTES
			}
			System.out.println("Winner: " + poll_db.getWinner());									//DECLARING WINNER
			break;
		}
		n--;
		}
	}
}
// END OF CLASS