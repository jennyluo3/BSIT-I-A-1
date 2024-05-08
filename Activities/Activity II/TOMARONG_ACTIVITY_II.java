import java.util.Scanner;

public class TOMARONG_ACTIVITY_II{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First number: ");
        int fnum = sc.nextInt();

        System.out.print("Enter Second number: ");
        int snum = sc.nextInt();

        System.out.println("The Sum is "+(fnum+snum));
        System.out.println("The Difference is "+(fnum-snum));
        System.out.println("The Product is "+(fnum*snum));
        
    }
}
