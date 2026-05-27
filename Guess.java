import java.util.Scanner;
public class Guess{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int secret=33;
        int guess;
        do{
            guess=scan.nextInt();
            if(guess<secret){
                System.out.println("Guess is smaller");
            }
            else if(guess>secret){
                System.out.println("Guess is greater");


            }
            

            }
            while(guess!=secret);
                System.out.println("Guess is correct");

            

        }
    }
