import java.util.Scanner;
public class MatrixMaltiplication {
    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Dimension");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];			
                
        System.out.println("enter array a");
        
        for(int i = 0; i<rows;i++) {
            for(int j = 0;j<cols; j++) {
                a[i][j] = sc.nextInt();	
                }
        }
        System.out.println("enter array b");
        for(int i = 0; i<rows;i++) {
            for(int j = 0;j<cols; j++) {
                b[i][j] = sc.nextInt();	
                }
        }
        int c[][] = new int[rows][cols];
        
        for(int i = 0; i<rows;i++) {
            for(int j = 0;j<cols; j++) {
                c[i][j] = a[i][j]*b[i][j];	
                }
        }
        System.out.println("result of c:");
        for(int i = 0; i<rows;i++) {
            for(int j = 0;j<cols; j++) {
                System.out.print(c[i][j] +" ");	
                }
            System.out.println();
        }
}
