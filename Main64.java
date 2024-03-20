import java.util.Scanner;

public class Main64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] num = a.split(" ");

        int result = (((Integer.parseInt(num[0]) < Integer.parseInt(num[1])) ? Integer.parseInt(num[0]) : Integer.parseInt(num[1])) 
                    > Integer.parseInt(num[2])) ? Integer.parseInt(num[2]) : ((Integer.parseInt(num[0]) < Integer.parseInt(num[1])) ? Integer.parseInt(num[0]) : Integer.parseInt(num[1])) ;


        System.out.println(result);

        scanner.close();

    }
    
}