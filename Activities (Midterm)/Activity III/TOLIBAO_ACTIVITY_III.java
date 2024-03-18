import java.util.Scanner;
public class TOLIBAO_ACTIVITY_III {
       public static void main(String [] args) {
            
        int[][] score = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 score separated by space or new line: ");

        for (int i = 0; i < 5; ++i){
            for (int j = 0; j<5; ++j){
                score[i][j] = scanner.nextInt();

            }
        }
        scanner.close();
        int sum = 0;
        for (int i = 0; i<5; ++i){
            for (int j = 0; j<5; ++j){
                sum += score[i][j];
            }
        }
        double average = sum / 25.0;
        
        System.out.println("Average score: " + average);
        
        
        
    }
}
