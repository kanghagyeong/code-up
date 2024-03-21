import java.util.Scanner;

public class Main69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.nextLine();

        switch (grade) {
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
            System.out.println("what?");
                break;
        }

        scanner.close();

    }

}