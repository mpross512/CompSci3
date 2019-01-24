public class Cell implements Comparable<Cell> {

    private boolean openUp, openDown, openLeft, openRight;
    private boolean occupied;
    private int x, y;
    private CellType cellType;

    public Cell() {
        openUp = false; 
        openDown = false;
        openLeft = false;
        openRight = false;
        occupied = false;
        x = 0;
        y = 0;
    }   
    
    public Cell(boolean openUp, boolean openDown, boolean openLeft, boolean openRight, int x, int y) {
        this.openUp = openUp;
        this.openDown = openDown;
        this.openLeft = openLeft;
        this.openRight = openRight;
        this.x = x;
        this.y = y;
        occupied = false;
        cellType = CellType.EMPTY;
    }

    public enum CellType {
        EMPTY,
        TRAVERSED,
        BEGINNING,
        END
    }

    public boolean isOpenUp() {
        return openUp;
    }

    public boolean isOpenLeft() {
        return openLeft;
    }

    public boolean isOpenRight() {
        return openRight;
    }

    public boolean isOpenDown() {
        return openDown;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public CellType getCellType() {
        return this.cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean equals(Cell c) {
        return (c.getY() == this.getY() && c.getX() == this.getX());
    }

    public int compareTo(Cell c) {
        if(this.getY() == c.getY())
            return this.getX() - c.getX();
        return this.getY() - c.getY();
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