import java.util.Scanner;
public class LIBRADO_ACTIVITY_VI {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("PLease enter the total number of seconds:");
        int sec = sc.nextInt();

        while(sec>=0){
            System.out.println(sec);
            sec--;
        }
    }
}