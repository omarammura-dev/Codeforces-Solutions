import java.util.ArrayList;
import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        /*
        * We have "n" participants
        * K is for Places --->>> k-th */
 
        int k,n,points_places;
        int next_round = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
 
        int[] points_list = new int[n];
        for (int i=0;i<n;i++)
        {
            int values = scanner.nextInt();
            points_list[i] = values;
            points_places = points_list[k-1];
            if (points_list[i] >= points_places && points_list[i]>0)
            {
                next_round++;
            }
 
        }
       System.out.println(next_round);
 
    }
}