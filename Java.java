import java.util.Scanner;
class Java{
    public static void main(String arg[]){
        System.out.println("This is a placement training class");
        double d=8.8;
        int x=(int)d;
        System.out.println(x);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scan.nextInt();
        System.out.println(a);
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("Even");


        }
        else{
            System.out.println("Odd");

        }





    }
}