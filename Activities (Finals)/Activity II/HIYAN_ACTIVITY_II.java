import java.util.Scanner;
public class HIYAN_ACTIVITY_II{

    static int getfeet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Feet: ");
        return sc.nextInt();
    }
    public static void main(String []args){
        int feet = getfeet();
        int inches = feet * 12;
        System.out.println("Inches: "+inches);
      
    }
    
}
