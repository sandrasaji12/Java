import java.util.Scanner;
public class Matrixaddition 
{
public static void main(String[] args)
 {
System.out.println("Sandra Saji \n23MCA047 \n13/02/24");
System.out.println("Qn:Read 2 matrices from the console and perform matrix addition.");
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int rows = scanner.nextInt();
System.out.print("Enter the number of columns: ");
int cols = scanner.nextInt();
int[][] matrix1 = new int[rows][cols];
System.out.println("Enter the values for matrix 1:");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
matrix1[i][j] = scanner.nextInt();
}
}
int[][] matrix2 = new int[rows][cols];
System.out.println("Enter the values for matrix 2:");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
matrix2[i][j] = scanner.nextInt();
}
}
int[][] result = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
result[i][j] = matrix1[i][j] + matrix2[i][j];
}
}
System.out.println("Results:");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < rows; j++) {
System.out.print(result[i][j] + " ");
}
System.out.println();
}
scanner.close();
}
}
