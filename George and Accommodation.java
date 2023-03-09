import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter=0;
        int number_of_rooms = scanner.nextInt();
        int[][] array = new int[number_of_rooms][2];
        for (int i = 0; i < array.length; i++) {

                array[i][0] = scanner.nextInt();
                array[i][1] = scanner.nextInt();
                if (array[i][0] == array[i][1])
                {
                    //
                }
                else if (array[i][0] < array[i][1])
                {
                    if (array[i][1]-array[i][0] >=2)
                    {
                        counter++;
                    }

                }

        }
        System.out.println(counter);
    }
}