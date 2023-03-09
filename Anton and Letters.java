import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] list = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (Character c : list)
        {
            if (Character.isLetter(c))
            {
                set.add(c);
            }
        }

        System.out.println(set.size());
    }
}