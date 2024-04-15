import java.util.Scanner;
public class ELEMINO_ACTIVITY_II {
    static feet(int f){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the feet:");
        return sc.nextInt();
    }
    public static void main(String[] args){
        int inches = feet() * 12;
        System.out.println(inches);
    }
}
