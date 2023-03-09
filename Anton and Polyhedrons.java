import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            switch ( scanner.next())
            {
                case "Tetrahedron":
                    result += 4;
                    break;
                case "Cube":
                    result += 6;
                    break;
                case "Octahedron":
                    result += 8;
                    break;
                case "Dodecahedron":
                    result += 12;
                    break;

                case "Icosahedron":
                    result += 20;
                    break;
            }
        }
        System.out.println(result);
    }
}