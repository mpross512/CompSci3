//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		odds = new TreeSet<Integer>();
		evens = new TreeSet<>();
	}

	public OddEvenSets(String line)
	{
		this();
		String[] nums = line.split(" ");
		for(String num : nums)
			if(Integer.parseInt(num) % 2 == 0)
				evens.add(Integer.parseInt(num));
			else
				odds.add(Integer.parseInt(num));
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}