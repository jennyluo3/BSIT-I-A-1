import java.util.Scanner;
public class BRIONES_ACTIVITY_1{
    public static void main(Sring []args){
     Scanner sc = new Scanner(System.in);

     String[] names = new String[5];
     
        for(int i = 0; i < 5; i++){
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i]  = sc.nextLine();
         }

         int choice;
         System.out.print("Enter the number on the list of name you want to display: ");
         choice =  sc.nextInt();

         if (choice >= 1 && choice <= 5){
            System.out.print("You Selected "+ names[choice - 1]);
         }
         else{
            System.out.print("Invalid Input.");
         }
                


    }
}