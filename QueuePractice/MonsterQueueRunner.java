import java.util.PriorityQueue;
import java.util.Scanner;

public class MonsterQueueRunner {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Monster> monsterQueue = new PriorityQueue<>();

        System.out.print("How many monsters did you wish to enter? :: ");
        int numMonsters = scanner.nextInt();
        for(int i = 0; i < numMonsters; i++) {
            System.out.print("Enter the height :: ");
            int height = scanner.nextInt();
            System.out.print("Enter the weight :: ");
            int weight = scanner.nextInt();
            System.out.print("Enter the age    :: ");
            int age = scanner.nextInt();

            monsterQueue.add(new Monster(height, weight, age));
            System.out.println("\n");
        }

        System.out.println(monsterQueue + "\n");
        System.out.println("getMin() - " + getMin(monsterQueue));
        System.out.println("removeMin() - " + monsterQueue.remove() + "\n");
        System.out.println(monsterQueue + "\n");
        System.out.println("getMin() - " + getMin(monsterQueue));
        System.out.println("removeMin() - " + monsterQueue.remove() + "\n");
        System.out.println(monsterQueue);

    }

    public static String getMin(PriorityQueue<Monster> queue) {
        return queue.peek().toString();
    }

}