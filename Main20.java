import java.util.Scanner;

public class Main20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        a = scanner.nextLine();

        String[] temp = a.split("-");
       
        System.out.println(temp[0] + temp[1]);
        scanner.close();
    }

}