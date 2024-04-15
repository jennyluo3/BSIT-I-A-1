import java.util.Scanner;

public class REMETICADO_ACTIVITY_II {
   
    public static double feetToInches(double feet) {
        
        return feet * 12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length in feet: ");
        double feet = scanner.nextDouble();

        
        double inches = feetToInches(feet);

        
        System.out.println(feet + " feet is equal to " + inches + " inches.");

        scanner.close(); 
    }
}