import java.util.Scanner;

public class REMETICADO_JOWARD_ACTIVITY_III {

    

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        double[][] scores = new double[5][5];
        System.out.print("Enter scores: ");

        for (int i = 0 ; i < 5; ++i){
            for (int j = 0; j < 5; j++){
                scores[i][j] = sc.nextDouble();
            }
          
            
        }
        double sum = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                sum += scores [i][j];
            }
        }
        double average = sum / 25.0;
        System.out.println("Average of all scores: "+ average);
    }
    
}
