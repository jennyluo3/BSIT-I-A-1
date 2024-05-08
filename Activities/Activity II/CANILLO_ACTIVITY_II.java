import java.util.Scanner;

public class CANILLO_ACTIVITY_II {
    public static void main(String[] args) {
        
        double num1, num2, result;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble();
        
        
        result = num1 + num2;
        System.out.println("Sum = " + result);
        
        result = num1 - num2;
        System.out.println("Difference = " + result);
        
        result = num1 * num2;
        System.out.println("Product = " + result);
    }
}
