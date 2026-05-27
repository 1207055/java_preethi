import java.util.Scanner;
public class Switcheg{
    public static void  main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Color:");
        String s=scan.nextLine();
        switch(s){
            case "Red":
                System.out.println("Stop");
                break;
            case "Green":
                System.out.println("Go");
                break;
            case "Yellow":
                System.out.println("Ready");
                break;
            default:
                System.out.println("Not Exists");
                break;


                
                

                



    }
}
}