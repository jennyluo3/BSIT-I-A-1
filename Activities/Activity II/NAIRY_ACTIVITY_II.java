import java.util.Scanner;
public class NAIRY_ACTIVITY_II {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);


        System.out.print("Input First Number: ");
        int asum = input.nextInt();

        System.out.print("Input the Second Number: ");
        int bsum = input.nextInt();

        int Sum = asum + bsum;
        int Sub = asum - bsum;
        int Num = asum * bsum;

        System.out.println("Sum: "+Num);
        System.out.println("Subtraction: "+Sub);
        System.out.println("Multiplication: "+Num);


    }
}
