import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie_2 {
    public static void zadaca_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println();

        if (a < b){
            System.out.println(a + " < " + b);
        } else if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a == b) {
            System.out.println(a + " = " + b);
        }

        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " / " + b + " = " + (a / b));

    }

    public static void zadaca_2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String a = scanner.nextLine();
        System.out.print("Введите первую строку: ");
        String b = scanner.nextLine();

        System.out.println("================");
        if(a.equals(b)) {
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }
    }

    public static List zadaca_3(int[] arr){
        List<Integer> result= new ArrayList<>();
        for(int a : arr){
            if(a % 2 == 0){
                result.add(a);
            }
        }
        //System.out.println(result);
        return result;
    }
}
