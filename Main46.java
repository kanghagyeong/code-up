import java.util.Scanner;

public class Main46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] cal = a.split(" ");

        int plus = Integer.parseInt(cal[0]) + Integer.parseInt(cal[1]) + Integer.parseInt(cal[2]);
        Double average =  (Double.parseDouble(cal[0]) + Double.parseDouble(cal[1]) + Double.parseDouble(cal[2])) / 3;

        System.out.println(plus);
        
        System.out.printf("%.1f",average);
    }
    
}