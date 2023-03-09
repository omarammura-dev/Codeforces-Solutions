import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.next();
        String n2 = scanner.next();
        char[] chars1 = n1.toCharArray();
        char[] chars2 = n2.toCharArray();
        char[] chars_result = new char[chars2.length];
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == chars2[i])
                chars_result[i] = '0';
            else if (chars1[i] != chars2[i])
                chars_result[i] = '1';
        }

        System.out.println(chars_result);
    }
}