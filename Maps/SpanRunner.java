import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SpanRunner {

    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("spantoeng.dat"));
        
        int num = file.nextInt();
        file.nextLine();

        SpanishToEnglish dictionary = new SpanishToEnglish();

        for(int i = 0; i < num && file.hasNextLine(); i++) {
            dictionary.add(file.next(), file.next());
            file.nextLine();
        }

        System.out.println(dictionary);

        while(file.hasNextLine())
            System.out.println(dictionary.translate(file.nextLine()));

    }
}