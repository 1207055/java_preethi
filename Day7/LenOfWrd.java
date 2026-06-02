import java.util.Scanner;

class LenOfWrd {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        String lastWrd = words[words.length - 1];
        return lastWrd.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        LenOfWrd obj = new LenOfWrd();
        int length = obj.lengthOfLastWord(s);

        System.out.println("Length of the last word: " + length);

        sc.close();
    }
}