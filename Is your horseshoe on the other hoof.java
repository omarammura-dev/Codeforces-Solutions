import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int result=0;
        for (int i = 0; i < 4; i++) {
            list.add(scanner.nextInt());
        }
        for (Integer i : list)
        {
            if (i != null)
            {
                set.add(i);
            }
        }
        result += list.size() - set.size();
        System.out.println(result);
    }
}