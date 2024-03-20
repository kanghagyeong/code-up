import java.util.Scanner;

public class Main45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] cal = a.split(" ");

        int plus = Integer.parseInt(cal[0]) + Integer.parseInt(cal[1]);
        int minus = Integer.parseInt(cal[0]) - Integer.parseInt(cal[1]);
        int multiply = Integer.parseInt(cal[0]) * Integer.parseInt(cal[1]);
        int division = Integer.parseInt(cal[0]) / Integer.parseInt(cal[1]);
        int remainder = Integer.parseInt(cal[0]) % Integer.parseInt(cal[1]); 
        Double rounding = Double.parseDouble(cal[0]) / Double.parseDouble(cal[1]); 

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(division);
        System.out.println(remainder);
        System.out.printf("%.2f",rounding);
    }
    
}