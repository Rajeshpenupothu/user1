import java.util.Scanner;
public class pyramid{
    public static void main(String a[])
    {
        Scanner user=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=user.nextInt();
        System.out.println("The pyramid is:");
        for (int i = 1; i <= n; i++)
        {
            for (int k = 1; k <= ( 2*i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
   
}