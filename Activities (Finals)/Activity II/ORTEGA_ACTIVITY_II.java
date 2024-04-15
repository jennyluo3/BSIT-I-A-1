import java.util.Scanner;
public class ORTEGA_ACTIVITY_II {
    static void conversion(int feet){
        int res= feet * 2;
        System.out.println("Conversion to Inches: " + res);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value (feet): ");
        int feet = sc.nextInt();
        conversion(feet);
        }
}
