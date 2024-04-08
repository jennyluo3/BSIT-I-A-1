import java.util.Scanner;
public class TOMARONG_ACTIVITY_1{
    
        static int getLength(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        return sc.nextInt();
        }
        static int getWidth(){
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the width of the rectangle:");
            return sc.nextInt();
        }

        public static void main(String[] args){
            int lenght = getLength();
            int width = getWidth();

            int area = lenght*width;

            System.out.println("Area:" +area);
        }
}