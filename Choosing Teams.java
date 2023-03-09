 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = scanner.nextInt();
        int k = scanner.nextInt();
        int counter = 0;
        int counter2 = 0;
        int[] list = new int[students];
        for (int i = 0; i < students; i++) {
            list[i] = scanner.nextInt();
            if (list[i] + k <= 5)
            {
                counter2++;
                if (counter2 == 3)
                {
                    counter2 = 0;
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}