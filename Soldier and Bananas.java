import java.util.ArrayList;
import java.util.Scanner;
 
 
 
public class Main {
    public static void main(String[] args) {
 
        int bananas,dollars,price,temp=0,te=0;
        Scanner scanner = new Scanner(System.in);
        price = scanner.nextInt();
        dollars = scanner.nextInt();
        bananas = scanner.nextInt();
 
 
        ArrayList<Integer> list_of_prices = new ArrayList<>();
 
        for (int i = 1; i <bananas+1; i++) {
            list_of_prices.add(price*i);
 
        }
        for (int i = 0; i < list_of_prices.size(); i++) {
            temp += list_of_prices.get(i);
        }
 
     
 
        if (temp>dollars)
        {
            int borrow = temp - dollars;
            System.out.println(borrow);
        }
        else if (temp == te){
            System.out.println();
        }
        else {
            System.out.println(0);
        }
    }
}