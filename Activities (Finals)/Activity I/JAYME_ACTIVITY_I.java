import java.util.Scanner;

public class JAYME_ACTIVITY_I {
  static int length(){ 
    Scanner sc= new Scanner (System.in);
    System.out.println(" Enter the length of the Rectangle:");
    return sc.nextInt();
  }
  static int width(){ 
    Scanner sc= new Scanner (System.in);
    System.out.println(" Enter the width of the Rectangle:");
    return sc.nextInt();
  }
  public static void main (String[]args){
   
    int result = length()*width()
    System.out.println(" Area of the rectangle;" +length()*width());
  }
}
