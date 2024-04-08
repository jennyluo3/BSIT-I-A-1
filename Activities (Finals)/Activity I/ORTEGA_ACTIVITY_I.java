import java.util.Scanner;
public class ORTEGA_ACTIVITY_I {
    static int width(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle:");
        return sc.nextInt();
    }

    static int length(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        return sc.nextInt();
    }

    public static void main(String []args){
    
        int result = width() * length();
        System.out.println("Area of the rectangle: " + result);

    }

}