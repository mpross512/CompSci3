import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RelativesRunner {

    public static void main(String[]args) throws IOException{
        Scanner file = new Scanner(new File("relatives.dat"));
        Relatives family = new Relatives();

        int num = file.nextInt();
        file.nextLine();

        for(int i = 0; i < num && file.hasNextLine(); i++) {
            family.add(file.next(), file.next());
        }
        file.close();

        System.out.println(family);
        
    }

}