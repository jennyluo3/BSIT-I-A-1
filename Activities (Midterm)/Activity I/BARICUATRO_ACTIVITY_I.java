import java.util.Scanner;
public class BARICUATRO_ACTIVITY_I {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a total of 5 names below: ");

        String[] names = new String[5];

        for(int i = 0; i<5; i++){
            System.out.print("Name " + (i+1) + ": ");
            names[i]= sc.nextLine();
        }

        System.out.print("Enter the number on the list of names you want to select(1-5): ");
        int num = sc.nextInt();

        if (num>=1 && num<=5){
            if(num==1){
                System.out.println(names[0]);
            } else if (num==2){
                System.out.println(names[1]);
            } else if (num==3){
                System.out.println(names[2]);
            } else if (num==4){
                System.out.println(names[3]);
            } else if (num==5){
                System.out.println(names[4]);
            } 
        }else {
            System.out.println("INVALID");
        }

           
    }
    
}
