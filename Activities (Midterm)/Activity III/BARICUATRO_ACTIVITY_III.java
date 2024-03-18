import java.util.Scanner;
public class BARICUATRO_ACTIVITY_III {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int scores[][]= new int[5][5];
        System.out.println("Enter scores:" );

      
        for(int x = 0; x<scores.length; x++){
            for(int q = 0; q<scores[x].length; q++){
                scores[x][q]= scanner.nextInt();
            }
        }

        double sum=0;
        for(int x = 0; x<scores.length; x++){
            for(int q = 0; q<scores[x].length; q++){
                sum += scores[x][q];
            }
        }

        double ave = sum/25.0;
        System.out.println("Average score is: " + ave);

    }
}

