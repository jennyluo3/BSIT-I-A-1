import java.util.Scanner;
public class BRIONES_ACTIVITY_III{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int[][]scores = new int[5][5];
        System.out.print("Enter The Scores: ");

        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j<scores.length; j++){
                System.out.print("Scores for row " +(i+1)+ ",column"+(j+1)+":");
                scores[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        int count = 0;
        for(int i = 0; i g < scores.length; i++){
            for(int j = 0; j<scores.length; j++){
                sum += scores[i][j];
                count++;
            }
        }

        double average = (double)sum / count;
        System.out.println("Average score: " + average);

    }
    }




