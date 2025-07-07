

public class Main {
    public static String bmi(double weight, double height) {
       double bm = weight/Math.pow(height,2);
       if (bm <= 18.5) {
           return "Underweight";
       } else if (bm <= 25) {
           return "Normal";
       } else if (bm <= 30) {
           return "Overweight";
       }  else if (bm > 30) {
           return "Obese";
       }
       return null;
    }

    public static void Main(String[] args) {
        String str = "DONAL";
        System.out.println(bmi(50,1.80));
    }
}
