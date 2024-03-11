import java.util.Scanner;

public class REBIAS_ACTIVITY_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < 5; 1++) {
            System.out.println("Enter name" + (1 + 1) + ": ");
            names[i] = sc.nextLine();
        }
        int choice;
        System.out.println("Enter the number on the list of names you want to display");
        choice = sc.nextLine();

        if (choice >= 1 && choice <= 5) {
            System.out.println("You have selected" + names[choice]);
        } else {
            System.out.println("Invalid input");
        }
    }
}