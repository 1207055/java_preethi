public class Reverse{
    public static void main(String args[]){
        int rev=0;
        int n=198;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;


        }
        System.out.println(rev);
    }

}