import java.util.Scanner; 
public class FLORES_ACTIVITY_II {
        static void inch(double feet){
            double res= feet*12;
            System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter number of feet:" );
        double feet= input.nextDouble();
        inch(feet);
    }
} 
