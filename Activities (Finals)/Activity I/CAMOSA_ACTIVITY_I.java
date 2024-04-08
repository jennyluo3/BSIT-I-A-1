import java.util.Scanner;
    public class CAMOSA_ACTIVITY_I{

            static int length(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the rectangle");
            return sc.nextInt();
            }
            
            static int width(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the width of the rectangle");
            return sc.nextInt();
            }

            public static void main(String[]args);
            int result = length()*width();
            system.out.println("Area of the rectangle;" +length()*width());
        }   