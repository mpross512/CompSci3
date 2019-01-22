//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueue
{
	//pick your storage for the queue
	//you can use the an array or an ArrayList

	//option 2
	private ArrayList<Integer> listOfInts;

	public IntQueue()
	{
		listOfInts = new ArrayList<>();
	}

	public void add(int item)
	{
		listOfInts.add(item);
	}

	public int remove()
	{
		if(listOfInts.size() > 0)
			return listOfInts.remove(0);
		return 0;
	}

	public boolean isEmpty()
	{
		return listOfInts.size() == 0;
	}

	public int peek()
	{
		return listOfInts.get(0);
	}

	public String toString()
	{
		return listOfInts.toString();
	}
}