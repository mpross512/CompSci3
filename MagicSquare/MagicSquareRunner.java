public class MagicSquareRunner {

    public static void main(String[]args) {
        MagicSquare1 magicSquare = new MagicSquare1(3, new int[]{8, 1, 6, 3, 5, 7, 4, 9, 2});
        System.out.println(magicSquare);

        magicSquare = new MagicSquare1(3, new int[]{6, 1, 8, 7, 5, 3, 2, 9, 4});
        System.out.println(magicSquare);

        magicSquare = new MagicSquare1(3, new int[]{8, 3, 1, 3, 5, 7, 9, 4, 2});
        System.out.println(magicSquare);

        magicSquare = new MagicSquare1(4, new int[]{7, 12, 1, 14, 2, 13, 8, 11, 16, 3, 10, 5, 9, 6, 15, 4});
        System.out.println(magicSquare);

        System.out.println("\n\n");

        MagicSquare2 filledSquare = new MagicSquare2(5);
        System.out.println(filledSquare);

        filledSquare = new MagicSquare2(4);
        System.out.println(filledSquare);

        filledSquare = new MagicSquare2(7);
        System.out.println(filledSquare);

        filledSquare = new MagicSquare2(3);
        System.out.println(filledSquare);
    }

}