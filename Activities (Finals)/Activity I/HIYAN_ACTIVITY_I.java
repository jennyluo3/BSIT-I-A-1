import java.util.Scanner;

public class HIYAN_ACTIVITY_I {
   public static void main(String []args){
    int length = getLength();
    int width = getWidth();
    int area = length * width;
    System.out.println("Area = "+area);
   }

   public static int getLength(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the rectangle: ");
    return sc.nextInt();
   }

   public static int getWidth(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the width of the rectangle: ");
    return sc.nextInt();
   }
    }


