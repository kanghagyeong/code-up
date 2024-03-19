import java.util.Scanner;

public class Main29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a;
        a = scanner.next();
        double temp = Double.parseDouble(a);

        System.out.println(String.format("%.11f", temp));
       

    }

}