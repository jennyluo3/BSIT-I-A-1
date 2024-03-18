import java.util.Scanner;

public class IPILI_ELAINE_ACTIVITY_3{
    public static void main(String[]args){
        int[][] scores= new Int [5][5];
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter scores");
        
        for(int x=0; x<sample.lenght; x++){
            for(int y=0;y<sample[x].length; y++){
                scores[x][y]= sc.nextInt();
                System.out.println(sample[x][y]);
            }
        }
        int sum=0;
        for(int x=0;x<5; x++){
            for(int x= 0;y<5; y++){
                sum+= scores[x][y];

            }
        }
        int average= 25;
        System.out.println("Average of all scores:" +average);
    }


