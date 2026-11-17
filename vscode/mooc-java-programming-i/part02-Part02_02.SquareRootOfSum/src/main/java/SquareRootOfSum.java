
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.valueOf(scanner.nextLine());
        int n2 = Integer.valueOf(scanner.nextLine());

        int total = n1+n2;

        System.out.println(Math.sqrt(total));

    }
}
