import java.util.Scanner;

public class Main32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a;
        a = scanner.nextInt();
        String temp = Integer.toHexString(a).toLowerCase();

        System.out.println(temp);
        
    }

}