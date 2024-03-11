import java.util.Scanner;
public class [ROSALITA_ACTIVITY_I] {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        System.out.print("Enter a number: ");
        
        for (int i = 0 ; i < 5; i++){
            System.out.print("Name" + (i + 1) + ":");
            Name [1] = Scanner.nextline();
        }
        System.out.print(s:"Enter a number between 1 and 5 to select a name: ");
        int index = sc.nextInt();

        if (index < 1 || index > 5){
            System.out.print(s:"Invalid input. Number must be between 1 and 5: ");
            return;
        }
        System.out.print("Selected name:" + names[index - 1]);
        
    }

    
}

    
