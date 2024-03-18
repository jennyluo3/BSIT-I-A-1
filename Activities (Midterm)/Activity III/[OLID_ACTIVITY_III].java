import java.util.Scanner;

public class OLID_ACTIVITY_III {

    public static void main(String[]args){
       
        double[][] scores = new double [5][5];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter scores: ");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                scores [i][j] = sc.nextDouble();
            }
        } 
        double sum = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                sum += scores[i][j];
            }
        }
        double average = sum / 25.0;

        System.out.println("Average of all scores: " +average);

      
    }

}
Write to A Jay Reducto Rosalita
