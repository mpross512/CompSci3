import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class MazeSolver {

    public static void main(String[] args) throws IOException{
        Scanner file = new Scanner(new File("bigmaze3.txt"));

        Cell[][] maze = new Cell[file.nextInt()][file.nextInt()];
        file.nextLine();


        String lineOne = file.nextLine(), lineTwo = file.nextLine(), lineThree = file.nextLine();

        for(int r = 0; r < maze.length; r++) {
            for(int c = 0; c < maze[r].length * 2; c+=2) {
                maze[r][c/2] = new Cell(
                    lineOne.charAt(c + 1) == ' ',
                    lineThree.charAt(c+1) == ' ',
                    lineTwo.charAt(c) == ' ',
                    lineTwo.charAt(c + 2) == ' '
                );

            }
            if(r != maze.length - 1) {
                lineOne = lineThree;
                lineTwo = file.nextLine();
                lineThree = file.nextLine();
            }
        }

        Maze bigMaze = new Maze(maze);
        System.out.println(bigMaze);

    }

}