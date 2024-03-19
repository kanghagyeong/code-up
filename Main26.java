import java.util.Scanner;

public class Main26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a;
        a = scanner.nextLine();

        String[] minute = a.split(":");
        if (minute[1].equals("00")) {
            System.out.println("0");
        } else {
            System.out.println(minute[1]);
        }

        


    }

}