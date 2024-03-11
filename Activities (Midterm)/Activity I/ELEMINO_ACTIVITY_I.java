import java.util.Scanner;
    public class ELEMINO_ACTIVITY_I {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            String[] name = new String[5];

            for(int i = 0; i < 5; i++)
            {
                System.out.println("Enter name " + (i + 1) + ": ");
                name[i] = sc.nextLine();
            }

            int choice;
            System.out.println("Enter a number list of name:");
            choice = sc.nextInt();

            if(choice <= 5 && choice >= 1)
            {
                System.out.println("You have selected " + name[choice - 1]);
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }
    }
