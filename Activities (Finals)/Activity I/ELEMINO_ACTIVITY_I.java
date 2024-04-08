import java.util.Scanner;
    public class ELEMINO_ACTIVITY_I {
        static int length(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length");
            return sc.nextInt();
        }
        static int width(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the width");
            return sc.nextInt();
        }
        public static void main(String[] args){

            int area = length() * length();
            System.out.println("Area: " + area);

        }
    }
