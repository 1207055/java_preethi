import java.util.Scanner;

public class Main {

    static String catAndMouse(int x, int y, int z) {
        int distA = Math.abs(x - z);
        int distB = Math.abs(y - z);

        if (distA < distB) {
            return "Cat A";
        } else if (distB < distA) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt(); // number of queries

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            System.out.println(catAndMouse(x, y, z));
        }

        sc.close();
    }
}