import java.util.Scanner;

public class Main71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        String[] nums = num.split(" ");

        for (int i = 0; i < nums.length; i++) {

            int number = Integer.parseInt(nums[i]);

            if (number == 0) {
                break;
            }

            System.out.println(number);
        }

        scanner.close();

    }

}