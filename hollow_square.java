import java.util.Scanner;
public class hollow_square{
    public static void main(String[] args) {
    Scanner as=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=as.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(i==1||j==n||i==n||j==1)
            System.out.print("$ ");
            else
            System.out.print("  ");
        }
        System.out.println( );
    }

}
}