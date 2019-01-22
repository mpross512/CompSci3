//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		String[] words = input.split(" ");

		Set<String> uniques = new TreeSet<String>(Arrays.asList(words));		

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		String[] words = input.split(" ");

		Set<String> uniques = new TreeSet<>();
		Set<String> dupes = new TreeSet<>();

		for(int i = 0; i < words.length; i++) {
			if(!uniques.add(words[i]))
				dupes.add(words[i]);
		}
		
		return dupes;
	}
}