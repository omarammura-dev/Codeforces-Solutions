 
import javax.lang.model.type.TypeKind;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max =0,sum=0;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }

        max = (int) Collections.max(arrayList);

        for (int i = 0; i < n; i++) {
            sum += max - (int)arrayList.get(i);
        }

        System.out.println(sum);
        

    }
}