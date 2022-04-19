package hw3;

import java.util.Scanner;

public class TowersOfHanoi {

    public static String showMoves(int n, char startPeg,
            char destPeg, char tempPeg) {
        if (n == 1) {
            return "Move disk 1 from peg " + startPeg
                    + " to peg " + destPeg + "\n";
        } else { // Recursive step
            return showMoves(n - 1, startPeg, tempPeg, destPeg)
                    + "Move disk " + n + " from peg " + startPeg
                    + " to peg " + destPeg + "\n"
                    + showMoves(n - 1, tempPeg, destPeg, startPeg);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of disks ");
        int nDisks = in.nextInt();
        String moves = showMoves(nDisks, 'L', 'R', 'M');
        System.out.println(moves);
    }
}

