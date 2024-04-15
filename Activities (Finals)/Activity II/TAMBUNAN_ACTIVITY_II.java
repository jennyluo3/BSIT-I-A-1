import java.util.Scanner;

public class TAMBUNAN_ACTIVITY_II {
    static double convert(double feet){
        double inches = feet * 12.0;
        System.out.println(inches);
        return inches;
    }

    public static void main(String[] args) {
		System.out.println("Please Input A Number");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        convert(num);
    }
}