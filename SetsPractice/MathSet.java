//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -  

import java.util.Set;
import java.util.TreeSet;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import static java.lang.System.*;

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
		return null;
	}

	public Set<Integer> differenceBMinusA()
	{
		return null;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		return null;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}