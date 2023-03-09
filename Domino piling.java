import java.util.ArrayList;
import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
    
        int width,length,number_domino,board_area,total_domino;
        Scanner scanner = new Scanner(System.in);
       width = scanner.nextInt();
       length = scanner.nextInt();
 
       board_area = width*length;
       total_domino = board_area /2;
 
        System.out.println(total_domino);
 
 
 
 
    }
}