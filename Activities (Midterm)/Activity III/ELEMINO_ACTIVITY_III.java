import java.util.Scanner;
public class ELEMINO_ACTIVITY_III {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        double[][] scores = new double[5][5];
        System.out.println("Enter your score:");

        double sum = 0;
        for(int x=0; x<scores.length; x++){
            for(int y=0; y<scores[x].length; y++){
                scores[x][y] = sc.nextDouble();
                sum += scores[x][y];
            }
        }
        double average = sum/25.0;
        System.out.println("Average of all scores: "+ average);

    }
}
