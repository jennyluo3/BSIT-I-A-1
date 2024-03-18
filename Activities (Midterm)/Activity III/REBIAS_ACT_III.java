import java.util.Scanner;

public class REBIAS_ACT_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[5][5];

        for (int x = 0; x < score.length; x++) {
            for (int y = 0; y < score.length; y++) {
                System.out.println("Enter score for row " + (x + 1) + ", column" + (y + 1) + ":");
                score[x][y] = sc.nextInt();
            }
        }
        int sum = 0;
        int count = 0;
        for (int x = 0; x < score.length; x++) {
            for (int y = 0; y < score.length; y++) {
            }
        }
        double average = (double) sum / count;
        System.out.println("The Average of the Scores: " + average);
    }
}
