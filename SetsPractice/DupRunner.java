//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class DupRunner
{
	public static void main( String args[] )
	{
		String list1 = "a b c d e f g h a b c d e f g h i j k";
		String list2 = "one two three one two three six seven one two";
		String list3 = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";

		
		System.out.println("Original List : " + list1);
		System.out.println("Uniques : " + UniquesDupes.getUniques(list1).toString());
		System.out.println("Dupes : " + UniquesDupes.getDupes(list1).toString() + "\n\n");

		System.out.println("Original List : " + list2);
		System.out.println("Uniques : " + UniquesDupes.getUniques(list2).toString());
		System.out.println("Dupes : " + UniquesDupes.getDupes(list2).toString() + "\n\n");

		System.out.println("Original List : " + list3);
		System.out.println("Uniques : " + UniquesDupes.getUniques(list3).toString());
		System.out.println("Dupes : " + UniquesDupes.getDupes(list3).toString() + "\n\n");
	}
}