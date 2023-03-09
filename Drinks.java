import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number_of_ju = scanner.nextInt();
        double result = 0;
        double[] array = new double[number_of_ju];
        for (int i = 0; i < number_of_ju; i++) {
            array[i] = scanner.nextDouble();
            double sum =0;
            sum += array[i];
            result += (sum/ array.length);
        }
        System.out.println(result);
    }
}