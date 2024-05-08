import java.util.Scanner;
public class CANILLO_ACTIVITY_VI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds");
        int seconds = sc.nextInt();
        
        while (seconds >= 0){
            System.out.println(seconds);
            seconds--;
        }
    }
}
