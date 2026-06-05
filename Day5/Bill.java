import java.util.*;

public class Bill {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;

        for (int cost : bill) {
            total += cost;
        }

        int annaShare = (total - bill.get(k)) / 2;

        if (annaShare == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - annaShare);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> bill = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            bill.add(sc.nextInt());
        }

        int b = sc.nextInt();

        bonAppetit(bill, k, b);

        sc.close();
    }
}