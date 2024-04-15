import java.util.Scanner;
public class NAIRY_ACTIVITY_II {
    static void conversion(int feet){
        int result = feet*12;
        System.out.println(result);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feet: ");
        int feet = sc.nextInt();
        conversion(feet);
    }

}
