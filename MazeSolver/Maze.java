import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Scanner;


public class Maze {

    private Cell[][] maze;

    private int currentX, currentY, targetX, targetY;
    private Stack<Cell> currentPath;
    private Set<Cell> badCells;

    public Maze() {
        currentX = 0;
        currentY = 0;
        targetX = 0;
        targetY = 0;

        currentPath = new Stack<>();
        badCells = new TreeSet<>();
        maze = new Cell[0][0];
    }

    public Maze(Cell[][] maze) {
        this();
        this.maze = maze;
    }

    public void solve() {
        ArrayList<String> steps = new ArrayList<>(); 
        for(int r = 0; r < maze.length; r++) {
            for(int c = 0; c < maze[r].length; c++) {
                if(maze[r][c].getCellType() == Cell.CellType.BEGINNING) {
                    currentX = c;
                    currentY = r;
                }
                if(maze[r][c].getCellType() == Cell.CellType.END) {
                    targetX = c;
                    targetY = r;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);

        currentPath.add(maze[currentY][currentX]);


        //while(currentX != targetX && currentY != targetY) {
        while(!currentPath.peek().equals(maze[targetY][targetX])) {
            System.out.print("PRESS ENTER");
            scanner.nextLine();
            currentX = currentPath.peek().getX();
            currentY = currentPath.peek().getY();

            if(currentPath.peek().isOpenUp() && !badCells.contains(maze[currentY - 1][currentX]) && !currentPath.contains(maze[currentY - 1][currentX])) {
                steps.add("UP");
                currentY--;
                currentPath.add(maze[currentY][currentX]);
                currentPath.peek().setOccupied(true);
            } else if(currentPath.peek().isOpenRight() && !badCells.contains(maze[currentY][currentX + 1]) && !currentPath.contains(maze[currentY][currentX + 1])) {
                steps.add("RIGHT");
                currentX++;
                currentPath.add(maze[currentY][currentX]);
                currentPath.peek().setOccupied(true);
            } else if(currentPath.peek().isOpenDown() && !badCells.contains(maze[currentY + 1][currentX]) && !currentPath.contains(maze[currentY + 1][currentX])) {
                steps.add("DOWN");
                currentY++;
                currentPath.add(maze[currentY][currentX]);
                currentPath.peek().setOccupied(true);
            } else if(currentPath.peek().isOpenLeft() && !badCells.contains(maze[currentY][currentX - 1]) && !currentPath.contains(maze[currentY][currentX - 1])) {
                steps.add("LEFT");
                currentX--;
                currentPath.add(maze[currentY][currentX]);
                currentPath.peek().setOccupied(true);
            } else {
                currentPath.peek().setOccupied(false);
                badCells.add(currentPath.pop());
                steps.remove(steps.size() - 1);
            }
            System.out.println(steps);
            System.out.println(toString());


        }

        scanner.close();
        
    }

    public String toString() {
        String output = "";
        for(int r = 0; r < maze.length; r++) {
            for(int c = 0; c < maze[r].length; c++) {
                if(maze[r][c].isOpenUp())
                    output += "+ ";
                else
                    output += "+-";
                if(c == maze[r].length - 1)
                    output += "+";
            }
            output+="\n";
            for(int c = 0; c < maze[r].length; c++) {
                if(c == 0 || !maze[r][c].isOpenLeft())
                    output += "|";
                else
                    output += " ";
                if(maze[r][c].isOccupied())
                    output += "@";
                else if(maze[r][c].getCellType() == Cell.CellType.BEGINNING)
                    output += "*";
                else if(maze[r][c].getCellType() == Cell.CellType.END)
                    output += "O";
                else
                    output += " ";
                if(c == maze[r].length - 1)
                    output += "|\n";
            }
        }
        return output;
    }
    
}