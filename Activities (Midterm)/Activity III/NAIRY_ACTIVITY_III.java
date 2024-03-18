import java.util.Scanner;

public class NAIRY_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] scores = new int[5][5];
        int totalSum = 0;
        int totalCount = 0;

        System.out.println("Enter 25 scores:");

        // Prompt the user to enter 25 scores
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter score " + (i * 5 + j + 1) + ": ");
                scores[i][j] = scanner.nextInt();
                totalSum += scores[i][j];
                totalCount++;
            }
        }

        // Calculate the average of all scores
        double average = (double) totalSum / totalCount;

        // Display the average
        System.out.println("Average of all scores: " + average);

        scanner.close();
    }
}