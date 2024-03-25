import java.util.Scanner;

public class Main84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] num = a.split(" ");

        int r = Integer.parseInt(num[0]);
        int g = Integer.parseInt(num[1]);
        int b = Integer.parseInt(num[2]);

        int count = 0;

        for (int i = 0; i < r; i++) {
            
            for (int j = 0; j < g; j++) {
                
                for (int k = 0; k < b; k++) {
                    
                    System.out.println(i + " " + j + " " + k);
                    count += 1;
                }
            }
        }
        System.out.println(count);
        scanner.close();

    }

}