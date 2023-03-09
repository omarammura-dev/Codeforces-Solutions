import java.util.*;


public class Main {
    public static void main(String[] args) {
        int counter_a=0,counter_d=0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();// number of games
        String s = scanner.next();// who won ? (foreach)
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A')
            {
                counter_a++;
            }
            else
            {
                counter_d++;
            }
        }
        if (counter_a>counter_d)
            System.out.println("Anton");
         else if (counter_a<counter_d)
            System.out.println("Danik");
         else
            System.out.println("Friendship");
    }
}