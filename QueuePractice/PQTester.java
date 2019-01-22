//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

import java.util.Queue;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private Queue<String> pQueue;

	public PQTester()
	{
		pQueue = new PriorityQueue<>();
	}

	public PQTester(String list)
	{
		pQueue = new PriorityQueue<>();
		setPQ(list);
	}

	public void setPQ(String list)
	{
		Scanner input = new Scanner(list);
		while(input.hasNext()) 
			pQueue.add(input.next());
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(pQueue.size() > 0) {
			output += pQueue.poll() + " ";
		}
		return output;		
	}

	public String toString() {
		return "toString() - " + pQueue.toString() + "\ngetMin() - " + getMin() + "\ngetNaturalOrder() - " + getNaturalOrder();
	}
}