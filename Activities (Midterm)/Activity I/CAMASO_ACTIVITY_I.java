import java.util.Scanner;

public class CAMASO_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter Name " + (i + 1) + ":");
            names[i] = sc.nextLine();
        }

        System.out.println("Enter the number in the list of names you want to display: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= 5) {
            System.out.println("You have selected: " + names[choice - 1]);
        } else {
            System.out.println("Invalid choice");
        }
    }
}