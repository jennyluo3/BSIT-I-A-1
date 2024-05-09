import java.util.Scanner;

public class CAMASO_ACTIVITY_I{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = getLength(sc);
        int width = getWidth(sc);
        int area = length * width;
        
        System.out.println("Area = " + area);
    }
    
    public static int getLength(Scanner sc){
        System.out.println("Enter the length of the Rectangle: ");
        return sc.nextInt();
    }
    
    public static int getWidth(Scanner sc){
        System.out.println("Enter the width of the Rectangle: ");
        return sc.nextInt();
    }
}