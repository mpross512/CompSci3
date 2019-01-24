//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -  

import java.util.Set;
import java.util.TreeSet;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
	}

	public MathSet(String o, String t)
	{
		this();
		String[] nums1 = o.split(" ");
		String[] nums2 = t.split(" ");
		for(int i = 0; i < nums1.length; i++) {
			one.add(Integer.parseInt(nums1[i]));
		} 
		for(int i = 0; i < nums2.length; i++) {
			two.add(Integer.parseInt(nums2[i]));
		}
	}

	public Set<Integer> union()
	{
		Set<Integer> union = new TreeSet<Integer>();
		for(int i : one)
			union.add(i);
		for(int i : two) 
			union.add(i);
		return union;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> union = new TreeSet<Integer>();
		Set<Integer> intersection = new TreeSet<Integer>();
		for(int i : one)
			if(!union.add(i))
				intersection.add(i);
		for(int i : two) 
			if(!union.add(i))
				intersection.add(i);
		return intersection;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> difference = new TreeSet<Integer>();
		Set<Integer> newB = new TreeSet<>();
		for(int i : two)
			newB.add(i);
		for(int i : one)
			if(newB.add(i))
				difference.add(i);
		return difference;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> difference = new TreeSet<Integer>();
		Set<Integer> newA = new TreeSet<>();
		for(int i : one)
			newA.add(i);
		for(int i : two)
			if(newA.add(i))
				difference.add(i);
		return difference;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> difference = new TreeSet<Integer>();
		for(int i : differenceAMinusB())
			difference.add(i);
		for(int i : differenceBMinusA())
			difference.add(i);
		return difference;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}