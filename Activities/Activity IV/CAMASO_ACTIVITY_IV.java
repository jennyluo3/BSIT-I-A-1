import java.util.Scanner;

public class CAMASO_ACTIVITY_IV{

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			 int boxNumber;

	        System.out.println("Please Input Color: ");
	        String color = scanner.nextLine();


	        switch (color){
	            case "red":
	                boxNumber = 1;
	                break;
	            case "green":
	                boxNumber = 2;
	                break;
	            case "black":
	                boxNumber = 3;
	                break;
	            default:
	                boxNumber = -1;
	                break;

	        }
	        if (boxNumber != -1){
	            System.out.println(boxNumber);
	        }else{
	            System.out.println("Unknown color");
	        }

	    }
}