import java.util.Scanner;
class Swap{
    public static void main(String arg[]){
        
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scan.nextInt();
        System.out.println("Enter a number:");
        int b=scan.nextInt();

       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);


       





    }
}