import java.util.Scanner;

public class CAMASO_ACTIVITY_II {
    static double convert(double feet){
        double inches = feet * 12.0;
        System.out.println("Inches: : "+ inches);
        return inches;
    }

    public static void main(String[] args) {
                System.out.println("Please Input A Number In Feet");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        convert(num);
    }
}