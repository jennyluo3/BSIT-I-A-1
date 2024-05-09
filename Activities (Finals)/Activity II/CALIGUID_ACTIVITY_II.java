import java.util.Scanner;
public class CALIGUID_ACTIVITY_II{
	static int converts(int feet){
		int inches = feet * 12;
		System.out.println(inches);
		return inches;
		}
	public static void main(String [] args){
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter feet: ");
		int num = input.nextInt();

		converts(num);
		}
	}
