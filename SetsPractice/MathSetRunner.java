//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("mathsetdata.dat"));
		int lines = 0;
		while(file.hasNextLine()) {
			lines++;
			file.nextLine();
		}
		file = new Scanner(new File("mathsetdata.dat"));
		for(int i = 0; i < lines/2; i++) {
			MathSet set = new MathSet(file.nextLine(), file.nextLine());
			System.out.print("\n\n" + set);
			System.out.println(
				"\nunion - " + set.union()
			  + "\nintersection - " + set.intersection()
			  + "\ndifference A-B - " + set.differenceAMinusB()
			  + "\ndifference B-A - " + set.differenceBMinusA()
			  + "\nsymmetric difference - " + set.symmetricDifference()
			  + "\n\n");
		}

		file.close();
	}
}
