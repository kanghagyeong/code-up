import java.util.Scanner;

public class Main18 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String a;
       a = scanner.next();

        String[] temp = a.split(":");

       System.out.println(temp[0] + ":" + temp[1]);
       scanner.close();
    }
    
}