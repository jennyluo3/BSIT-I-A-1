import java.util.Scanner;
public class URDANETA_ACTIVITY_I{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    
    String[] names = new String[5];

    for (int i = 0; i < 5; i++){
      System.out.print("Enter name " + (i + 1) + ": " );
      names[i] = sc.nextLine();
    }


    int choice;
    System.out.print ("Enter the number on the list of names you want to display: ");
    choice = sc.nextInt();

    if (choice >= 1 && choice <=5){
      System.out.print("You have selected " + names [choice - 1]);
    }
    else{
      System.out.print("Invalid input.");
    }
  }
}