import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long number_of_int = scanner.nextLong();
        long result = 0;
        if (number_of_int% 2 == 0)
            result = number_of_int /2;
        else if ( number_of_int%2==1)
            result = (number_of_int/2) + (-number_of_int);


        System.out.println(result);
    }
}