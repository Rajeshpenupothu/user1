//Using StringBuilder method
import java.util.Scanner;
public class reverse_string{
public static void main(String[] a){
    Scanner user=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=user.nextLine();
    String reversed=new StringBuilder(str).reverse().toString();
    System.out.println("Reversed string is:"+reversed);
}
}
//Using forloop method
import java.util.Scanner;
public class reverse_string{
public static void main(String[] args) {
    Scanner user=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=user.nextLine();
    String reversed="";
    for(int i=str.length()-1;i>=0;i--){
        reversed += str.charAt(i);
        }
        System.out.println("Reversed string is:"+reversed);
}
}