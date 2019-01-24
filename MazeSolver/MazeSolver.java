import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class MazeSolver {

    public static void main(String[] args) throws IOException{
        Scanner file = new Scanner(new File("bigmaze5.txt"));
        int col = file.nextInt();
        int row = file.nextInt();

        Cell[][] maze = new Cell[row][col];
        file.nextLine();


        String lineOne = file.nextLine(), lineTwo = file.nextLine(), lineThree = file.nextLine();

        for(int r = 0; r < maze.length; r++) {
            for(int c = 0; c < maze[r].length * 2; c+=2) {
                maze[r][c/2] = new Cell(
                    lineOne.charAt(c + 1) == ' ',
                    lineThree.charAt(c+1) == ' ',
                    lineTwo.charAt(c) == ' ',
                    lineTwo.charAt(c + 2) == ' ',
                    c/2, r
                );
                if(lineTwo.charAt(c + 1) == '*')
                    maze[r][c/2].setCellType(Cell.CellType.BEGINNING);
                if(lineTwo.charAt(c + 1) == 'O')
                    maze[r][c/2].setCellType(Cell.CellType.END);
            }
            if(r != maze.length - 1) {
                System.out.println(r);
                lineOne = lineThree;
                lineTwo = file.nextLine();
                lineThree = file.nextLine();
            }
        }

        file.close();


        Maze bigMaze = new Maze(maze);
        bigMaze.solve();
    }

}