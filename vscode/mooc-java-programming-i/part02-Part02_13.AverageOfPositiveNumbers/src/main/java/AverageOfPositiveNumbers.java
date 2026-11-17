
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int total = 0;

        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            if (n == 0){
                break;
            }
            if (n < 0){
                continue;
            }
            count += 1;
            total += n;
        }
        if (count == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double)total/count);
        }
    }
}
