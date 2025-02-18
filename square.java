import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {  // Loop for rows
            for (int j = 0; j < n; j++) {  // Loop for columns
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close();
    }
}