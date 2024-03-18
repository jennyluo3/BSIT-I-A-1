import java.util.Scanner;
  public class JAYME_ACTIVITY_III {
    public static void main (String[]args){

      double[][] scores = new double[5][5];

      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter Scores");

      for(int i = 0; i < 5; ++i) {
        for (int j = 0; j < 5; ++j) {
          scores[i][j] = scanner.nextDouble();
        }
      }
      double sum = 0;
      for(int i = 0; i < 5; ++i){
        for (int j = 0; j < 5; ++j) {
            sum += scores[i][j];
        }
      }
      double average = sum / 25.0;
      System.out.println("Average of all scores: " +average);

      scanner.close();


    }
}