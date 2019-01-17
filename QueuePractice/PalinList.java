//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;
	private String output;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		setList(list);
	}

	public void setList(String list)
	{
		Scanner input = new Scanner(list);
		while(input.hasNext()) {
			String next = input.next();
			queue.add(next);
			stack.add(next);
		}
		output = stack.toString();
	}

	public boolean isPalin()
	{
		for(int i = 0; i < stack.size(); i++) {
			if(!queue.remove().equals(stack.pop()))
				return false;
		}
		return true;
	}

	public String toString() {
		if(isPalin())
			return output + " is a palinlist.";
		return output + " is NOT a palinlist.";
	}

}