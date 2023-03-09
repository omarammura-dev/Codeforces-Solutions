import java.util.ArrayList;
import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
 
        int[][] matrix = new int[5][5];
        int move_col,move_row,minimum_moves=0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
 
            for (int j = 0; j < matrix.length; j++) {
 
                matrix[i][j] = scanner.nextInt();
 
                if (matrix[i][j] ==1)
                {
                    move_row = 2-j;
                    move_col = 2-i;
 
                    minimum_moves = Math.abs(move_row) + Math.abs(move_col);
 
                    System.out.println(minimum_moves);
                }
            }
 
        }
 
    }
}