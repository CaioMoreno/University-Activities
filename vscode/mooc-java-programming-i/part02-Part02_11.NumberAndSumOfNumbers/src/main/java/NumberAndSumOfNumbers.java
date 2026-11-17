
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());

            if (n == 0){
                break;
            }

            count += 1;
            total += n;
        }

        System.out.println("Number of numbers: "+ count);
        System.out.println("Sum of the numbers: "+ total);
    }
}
