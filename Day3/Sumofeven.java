import java.util.Scanner;
public class Sumofeven{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        
            }
        
         System.out.println(sum);
    }

    }

