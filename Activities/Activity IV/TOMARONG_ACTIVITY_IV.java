import java.util.Scanner;
public class TOMARONG_ACTIVITY_IV{
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the color of the item:");
         String color = sc.nextLine();

         switch (color){
            case "Red":
            System.out.println(1);
            break;
            case "Green":
            System.out.println(2);
            break;
            case "Blue":
            System.out.println(3);
            break;
            default:
            System.out.println("Nothing");

         }
      }
  }
