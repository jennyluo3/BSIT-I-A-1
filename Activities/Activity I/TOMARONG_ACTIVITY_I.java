import java.util.Scanner;
public class TOMARONG_ACTIVITY_I{
          public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
           int l= 10;
           int m= 50;
           int e= 40;

           int sum= l+m+e;
           int diff= l-m-e;
           int prod= l*m*e;
           int quot= l/m/e;

           System.out.println("Sum:" +sum);
           System.out.println("Difference:" +diff);
           System.out.println("Product:" +prod);
           System.out.println("Quotient:" +quot);
       }
}
