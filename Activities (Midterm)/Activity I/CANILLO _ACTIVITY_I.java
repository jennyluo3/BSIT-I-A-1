import java.util.Scanner;
public class TOMARONG_ACTIVITY_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] names = {"Maylene Minoza","Laiza Mae Tomarong","Lovenel Canillo","Gessyl Briones","Hazel Camosa"};
        System.out.println("Enter a number between 1 and 5:");
        int index = sc.nextInt();

        if(index>=1 && index<=5){
            System.out.println("The name you selected is:"+ names[index-1]);
        }
        else{
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
        }
        sc.close();
    }
}
