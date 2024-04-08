import java.util.Scanner;

public class REMETICADO_JOWARD_ACTIVITY_I {
    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();

        double area = calculateArea(length, width);

        System.out.println("Area of the rectangle: " + area);
    }
    public static double getLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        return scanner.nextDouble();
    }
    public static double getWidth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width of the rectangle: ");
        return scanner.nextDouble();
    }
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}