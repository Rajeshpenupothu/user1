//multiply n x n matrix(1 x 1,2 x 2,3 x 3) 2 x 2=23 34
                                               //56 32
import java.util.Scanner;
class matrix_multi{
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);//To take in from user
        System.out.println("Enter the size of the matrix:");
        int n=user.nextInt();
        //Creating objects for matrix A and B
        int [][] a=new int[n][n];
        int [][] b=new int[n][n];
        //Now create a matrix to store result of the multiplication
        int[][] c=new int[n][n];
         
         System.out.println("Enter the elements of the matrix:");
         for (int i = 0; i < n; i++) 
            for (int j=0;j<n;j++)
            a[i][j]=user.nextInt(); 

        System.out.println("Enter the elements of the matrix:");
         for (int i = 0; i < n; i++) 
            for (int j=0;j<n;j++)
            b[i][j]=user.nextInt(); 

        System.out.println("Multiplication of two matrices:");
        for (int i = 0; i < n; i++) {
           for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                c[i][j]+=a[i][k]*b[k][j];
               
            }
           
           }
        }
        System.out.println("Resultant matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
        }
         
    }
