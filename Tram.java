import java.util.*;


public class Main {
    public static void main(String[] args) {
        int out=0,in=0,sum=0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();// number of trams' stops
        int[][] array = new int[n][2];
        ArrayList<Integer> possibilities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            out = scanner.nextInt();
            in = scanner.nextInt();
            array[i][0] = out;
            array[i][1] = in;
        }
        for (int i = 0; i < array.length; i++) {
            int sum_first = 0;
            int temp_first = sum_first-array[i][0]+array[i][1];
            sum = sum-array[i][0]+array[i][1];

              possibilities.add(temp_first);
            possibilities.add(sum);
        }
        Collections.sort(possibilities);
        System.out.println(possibilities.get(possibilities.size()-1));
    }
}