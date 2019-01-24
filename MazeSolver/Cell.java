import javax.lang.model.util.ElementScanner6;

public class Cell {

    private boolean openUp, openDown, openLeft, openRight;
    private boolean occupied;

    public Cell() {
        openUp = false; 
        openDown = false;
        openLeft = false;
        openRight = false;
        occupied = false;
    }   
    
    public Cell(boolean openUp, boolean openDown, boolean openLeft, boolean openRight) {
        this.openUp = openUp;
        this.openDown = openDown;
        this.openLeft = openLeft;
        this.openRight = openRight;
        occupied = false;
    }

    public boolean isOpenUp() {
        return openUp;
    }

    public boolean isOpenLeft() {
        return openLeft;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public String toString() {
        String output = "+";
        if(openUp)
            output += " +\n";
        else
            output += "-+\n";
        if(openLeft)
            output += " ";
        else
            output += "|";
        if(occupied)
            output += "@";
        else
            output += " ";
        if(openRight)
            output += " \n+";
        else
            output += "|\n+";
        if(openDown)
            output += " +";
        else
            output += "-+";
        return output;
    }
    
}