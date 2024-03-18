import java.util.Scanner;
public class CAMOSA_ACTIVITY_III{
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        double[][] scores = new double [5][5];
        System.out.println("Enter your score");
        
        double sum = 0;
        for(int x=0; x<arr.length; x++){
            for(int y=0; y<arr[x].length; y++){
                scores[x][y] = sc.nextdouble();
                sum += scores[x][y];
            }
        }
        double average = sum/25.0;
        System.out.println("Average of all scores: "+ average);
    }
}