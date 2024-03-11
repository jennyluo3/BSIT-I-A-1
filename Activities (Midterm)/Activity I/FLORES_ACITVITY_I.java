import java.util.Scanner;
public class FLORES_ACITVITY_I {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String[]name=new String[5];
            System.out.println("Please enter 5 names.");
            for(int x=0; x<5;x++){
                System.out.print("Name " + (x+1) + ":");
                name[x]= input.nextLine();
            }
            System.out.print("Please Enter a number(1-5): ");
            int a= input.nextInt();

            if (a>=1 && a<=5){
                if (a==1){
                    System.out.println(name[0]);
                } else if (a==2){
                    System.out.println(name[1]);
                } else if (a==3){
                    System.out.println(name[2]);
                } else if (a==4){
                    System.out.println(name[3]);
                } else if (a==5){
                    System.out.println(name[4]);
                }
            } else{
                System.out.println("No name matched.");
            }
    }
}
