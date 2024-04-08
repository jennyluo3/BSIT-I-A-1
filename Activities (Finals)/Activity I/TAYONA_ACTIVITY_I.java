import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class TAYONA_ACTIVITY_I{
    public static void main(String []args){
		int length = Length();
		int width = Width();
		int area = length * Width;
        System.out.println("Area = " + area);

        static int length(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		return sc.nextInt();
		} 
		static int Width() {
			Scanner sc = new Scanner() {
			System.out.println("Enter the width of the rectangle: ");
            return sc.nextInt();
			}
		}
    }
}
