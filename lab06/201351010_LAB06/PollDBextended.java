package lab06;

import java.util.ArrayList;

public class PollDBextended extends PollDB			// EXTENDS POLLDB'S METHODS 
{
	ArrayList<String> cand=new ArrayList<String>();		// DECLARING ARRAY LISTS
	ArrayList<String> pos=new ArrayList<String>();
	PollDBextended(String[] candNames)					// CONSTRUCTOR
	{
		super(candNames);
		for(int i=0;i<5;i++)
		{
		cand.add(candNames[i]);							// ADDING NAMES
		}

	pos.add("Producer");								// ADDING POSITIONS
	pos.add("Director");
	pos.add("Cameraman");
	pos.add("Editor");
	pos.add("Writer");
	}
	
	void reset()										// RESET FUNCTION TO CLEAR THE VOTES COUNTER
	{
		for(int i=0;i<5;i++)
		{count[i]=0;}
	
	}
	
}
// END OF CLASS