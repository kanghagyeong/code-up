import java.util.Scanner;

public class Main85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] num = a.split(" ");
        long h = Integer.parseInt(num[0]);
        long b = Integer.parseInt(num[1]);
        long c = Integer.parseInt(num[2]);
        long s = Integer.parseInt(num[3]);

        long save = h * b * c * s;
        long result = save / 8;
        double realReault = result / Math.pow(2, 10) / Math.pow(2, 10);


        System.out.println(String.format("%.1f", realReault) + " " + "MB");
       
        scanner.close();

    }

}