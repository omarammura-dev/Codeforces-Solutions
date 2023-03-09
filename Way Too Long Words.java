import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
 
       int i,word_length;
       String word;
       char first_letter,last_letter;
       Scanner scanner = new Scanner(System.in);
       i = scanner.nextInt();
 
        for (int j = 0; j < i;j++)
        {
            word = scanner.next();
            word_length = word.length();
 
            if (word_length>10)
            {
 
                String final_length = String.valueOf(word_length - 2);
                first_letter = word.charAt(0);
                last_letter = word.charAt(word_length-1);
                word = first_letter + final_length + last_letter;
                System.out.println(word);
            }
            else
            {
                System.out.println(word);
            }
        }
 
 
 
    }
}