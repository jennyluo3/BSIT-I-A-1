import java.util.Scanner;

public class TOMARONG_ACTIVITY_II{
    public static void main(String []args){
        Scanner input=newScanner(System.in);
        
        System.out.print("Enter First number: ");
        int fnum = input.nextInt();

        System.out.print("Enter Second number: ");
        int snum = input.nextInt();

        System.out.println("The Sum is "+(fnum+snum));
        System.out.println("The Difference is "+(fnum-snum));
        System.out.println("The Product is "+(fnum*snum));
        
    }
}
