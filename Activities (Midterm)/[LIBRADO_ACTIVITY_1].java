import java.util.Scanner
public class [LIBRADO_ACTIVITY_1] {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String[] names = new String[5];

    for (int i = 0; i < 5; i++){
        System.out.print("Enter name " + (i + 1) + ": ");
        names[i] = sc.nextLine();

    }
int choice;
System.out.print("Enter the number in the list of the names you want to display: ");
choice = sc.nextInt();

if (choice >= 1 && choice <= 5);
System.out.print("You have selected names " + names[choice - 1]);
 else{
System.out.println("Invalid Input")
 }
 }
}
