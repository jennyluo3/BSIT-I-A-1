import java.util.Scanner;
public class ORTEGA_ACTIVITY_I {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
       
        for(int i = 0; i < 5; i++){
            System.out.println("Enter name: " + (i + 1) +": ");
            names[i] = sc.nextLine();
        }
       
        int choice;
        System.out.print("Enter the number of the chosen name: ");
        choice = sc.nextInt();

        if(choice >= 1 && choice <= 5){
            System.out.print(names[choice - 1]);
        }
        else{
            System.out.print("Invalid.");
        }
       
    }

}