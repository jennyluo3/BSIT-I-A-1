import java.util.Scanner;
public class PACULBA ACTIVITY_III{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [][] score = new int [5][5];

       for (int x = 0; x < score.length; x++) {
            for (int y = 0; y < score.length; y++) {
            System.out.print("Enter score : " );
            score[x][y] =sc.nextInt();

            }
       }
          
       int sum = 0;
       int count = 0;
       
        for (int x = 0; x < score.length; x++) {
            for (int y = 0; y < score.length; y++) {
            sum += score [x][y]; 
            count++;

            }
        }
       
        double average  = (double) sum / count;
        System.out.println ("Average of the scores entered: " +  average);

    }
}
