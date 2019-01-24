public class Maze {

    Cell[][] maze;

    public Maze() {
        maze = new Cell[0][0];
    }

    public Maze(Cell[][] maze) {
        this.maze = maze;
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
                else
                    output += " ";
                if(c == maze[r].length - 1)
                    output += "|\n";
            }
        }
        return output;
    }
    
}