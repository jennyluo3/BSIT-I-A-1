import java.util.Scanner;
public class CABALIDA _ACTIVITY_II {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in){

            System.out.println("Enter Feet: ");
            double num=sc.nextDouble();

            convert(num);
    }
    public static void convert(double num){
        System.out.println("Inches: "+num*12);

   }
}