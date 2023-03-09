import java.util.*;


public class Main {


    public static void main(String[] args) {
        int counter=0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int height_of_fence = scanner.nextInt();
        int[] array_of_friends = new int[n];

        for (int i = 0; i < n; i++) {
            array_of_friends[i] = scanner.nextInt();
            if (array_of_friends[i] <height_of_fence || array_of_friends[i] == height_of_fence)
                counter++;
            else if (array_of_friends[i]>height_of_fence)
                counter +=2;
        }
        System.out.println(counter);
    }
}