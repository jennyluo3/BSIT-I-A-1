import java.util.Scanner;
public class ABABAN_ACTIVITY_II {

    static int getfeet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Feet: ");
        return sc.nextInt();
    }
    public static void main(String []args){
        int feet = getfeet();
        int inches = feet * 12;
        System.out.println(inches);
      
    }
    
}
