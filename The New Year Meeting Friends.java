import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0,tp=0;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            array.add(scanner.nextInt());

        }
        Collections.sort(array);
        temp = array.get(2)- array.get(1);
        tp = array.get(1) - array.get(0);

        System.out.println(temp+tp);
        }




    }