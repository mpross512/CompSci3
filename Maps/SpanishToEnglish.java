import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * SpanishToEnglish
 */
public class SpanishToEnglish {

    Map<String, String> dictionary;

    public SpanishToEnglish() {
        dictionary = new TreeMap<>();
    }

    public void add(String spanish, String english) {
        dictionary.put(spanish, english);
    }

    public String translate(String sentence) {
        Scanner input = new Scanner(sentence);

        String output = "";
        while(input.hasNext())
            output += dictionary.get(input.next()) + " ";
        input.close();
        return output;
    }

    public String toString() {
        String output = "====\t\tMAP CONTENTS\t\t====";
        for(String spanish : dictionary.keySet()) 
            output += "\n" + spanish + "-" + dictionary.get(spanish);
        return output;
    }
}