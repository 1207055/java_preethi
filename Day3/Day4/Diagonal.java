import java.util.Scanner;
public class Diagonal{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("Matrix");
        for(int i=0;i<n;i++){
            
            System.out.println(arr[i][i]+" ");

        }

    }
}


