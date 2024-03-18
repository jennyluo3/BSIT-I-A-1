import java.util.Scanner;

public class BALLORI_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] scores = new int[5][5];
        System.out.println("Enter Scores:");

        for (int x = 0; x < scores.length; x++) {
            for (int y = 0; y < scores[x].length; y++) {
                scores[x][y] = input.nextInt();
            }
        }

        double sum = 0;
        for (int x = 0; x < scores.length; x++) {
            for (int y = 0; y < scores[x].length; y++) {
                sum += scores[x][y];
            }
        }

        double average = sum / 25.0;
        System.out.println("Total Score Average: " + average);
    }
}