public class MagicSquare2 {

    int size;
    int[][] magicSquare;

    public MagicSquare2(int size) {
        this.size = size;
        magicSquare = new int[size][size];
        fillSquare(magicSquare);
    }

    public void fillSquare(int[][] square) {
        int row = 0, col = size / 2, num = 1;
        square[row][col] = num;
        while(num < size * size) {
            row--;
            col++;
            num++;
            if(row < 0)
                row += size;
            if(col == size) 
                col -= size;
            if(square[row][col] != 0) {
                row+=2;
                col--;
                if(col < 0)
                    col += size;
                if(row >= size)
                    row -= size;
            } 
            square[row][col] = num;
        }
    }

    public String toString() {
        String output = "";
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                output += String.format("%4d", magicSquare[i][j]);
            }
            output += "\n";
        }
        return output;
    }

}