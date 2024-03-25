import java.util.Scanner;

public class Main86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] num = a.split(" ");
        int w = Integer.parseInt(num[0]);
        int h = Integer.parseInt(num[1]);
        int b = Integer.parseInt(num[2]);
        

        int save = w * h * b / 8;
        double realReault = save / Math.pow(2, 10) / Math.pow(2, 10);


        System.out.println(String.format("%.2f", realReault) + " " + "MB");
       
        scanner.close();

    }

}