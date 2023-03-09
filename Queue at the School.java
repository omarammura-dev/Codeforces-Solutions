import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int time = scanner.nextInt();
        String s = scanner.next();
        char[] chars = s.toCharArray();
        for (int i = 0; i < time; i++) {
            for (int j = 0; j < s.length()-1; j++) {
                if(chars[j]=='B' && chars[j+1]!='B')
                {
                    char temp=chars[j];
                    chars[j]=chars[j+1];
                    chars[j+1]=temp;
                    j++;
                }
            }
        }
        System.out.println(chars);
    }
}