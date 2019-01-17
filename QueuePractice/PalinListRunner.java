//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

public class PalinListRunner
{
	public static void main ( String[] args )
	{
		PalinList palinList = new PalinList("one two three two one");
		System.out.println(palinList);
		
		palinList.setList("1 2 3 4 5 one two three four five");
		System.out.println(palinList);

		palinList.setList("a b c d e f g x y z g f h");
		System.out.println(palinList);

		palinList.setList("racecar is racecar");
	}
}