import java.util.*;


public class Main {


    public static void main(String[] args) {

        int sum=0;
        Scanner scanner = new Scanner(System.in);
        int number_of_p = scanner.nextInt();
        int[] array = new int[number_of_p];
        for (int i = 0; i < number_of_p; i++) {
            array[i] = scanner.nextInt();

            sum += array[i];
        }

        if (sum > 0)
        {
            System.out.println("HARD");
        }
        else if (sum == 0)
        {
            System.out.println("EASY");
        }
    }
}