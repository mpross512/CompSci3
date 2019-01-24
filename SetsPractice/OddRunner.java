//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("oddevent.dat"));
		while(file.hasNextLine()) {
			System.out.println(new OddEvenSets(file.nextLine()));
		}				
		file.close();
	}
}