import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Maze {

    private Cell[][] maze;

    private int currentX, currentY, targetX, targetY;
    private Stack<Cell> currentPath;
    private Set<Cell> badCells;
    private Random rand;

    public Maze() {
        currentX = 0;
        currentY = 0;
        targetX = 0;
        targetY = 0;

        currentPath = new Stack<>();
        badCells = new TreeSet<>();
        rand = new Random();
        maze = new Cell[0][0];
    }

    public Maze(Cell[][] maze) {
        this();
        this.maze = maze;
    }

    public void solve() {
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

        while(currentX != targetX && currentY != targetY) {
            
        }
        
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