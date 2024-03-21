import java.util.Scanner;

public class Main64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] num = a.split(" ");
        int b = Integer.parseInt(num[0]);
        int c = Integer.parseInt(num[1]);
        int d = Integer.parseInt(num[2]);


        int result = ((b < c ? b : c)  > d) ? d: (b< c ? b : c);


        System.out.println(result);

        scanner.close();

    }
    
}