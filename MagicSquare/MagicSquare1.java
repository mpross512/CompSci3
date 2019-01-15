import java.util.ArrayList;

public class MagicSquare1 {

    private int[][] magicSquare;
    private int size;

    public MagicSquare1 (int size, int[] nums) {
        this.size = size;
        magicSquare = new int[size][size];
        for(int i = 0; i < size * size; i++) {
            magicSquare[i/size][i%size] = nums[i];
        }
    }

    public void setSquare(int size, int[] nums) {
        this.size = size;
        magicSquare = new int[size][size];
        for(int i = 0; i < size * size; i++)
            magicSquare[i/size][i%size] = nums[i];
    }

    public boolean isMagicSquare() {
        ArrayList<Integer> sums = new ArrayList<>();
        int sum1, sum2;
        for(int i = 0; i < size; i++) {
            sum1 = 0; 
            sum2 = 0;
            for(int j = 0; j < size; j++) {
                sum1 += magicSquare[i][j];
                sum2 += magicSquare[j][i]; 
            }
            if(sums.size() > 0 && !sums.contains(sum1))
                return false;
            sums.add(sum1);
            if(sums.size() > 0 && !sums.contains(sum2))
                return false;
            sums.add(sum2);
        }
        sum1 = 0;
        for(int i = 0; i < size; i++) {
            sum1+=magicSquare[size - i - 1][i];
        }
        if(!sums.contains(sum1))
            return false;
        return true;
    }

    public String toString() {
        String output = "";

        for(int i = 0; i < size * size; i++) {
            output+=magicSquare[i/size][i%size] + " "; 
            if(i%size == size - 1)
                output += "\n";
        }
        if(isMagicSquare())
            output += "MAGIC SQUARE";
        else 
            output += "NOT MAGIC SQUARE";
        return output;
    }

}