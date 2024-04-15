public class REBIAS_ACT_II {
    public static double feetToInches(double feet) {
        return feet * 12;
    }

    public static void main(String[] args) {
        double feet = 12;
        double inches = feetToInches(feet);
        System.out.println(feet + "feet is equal to" + inches + "inches.");

    }
}
