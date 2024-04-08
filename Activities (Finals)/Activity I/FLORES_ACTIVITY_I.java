import java.util.Scanner;
public class FLORES_ACTIVITY_I {
    
        static int length(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Length of the Triangle: ");
            return input.nextInt();
        }
        static int width(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Width of the Triangle: ");
            return input.nextInt();
        }
       public static void main(String[] args) {
        long area = width()*length();
        System.out.println("AREA = " + area);
    }
}
