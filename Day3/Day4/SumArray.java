import java.util.Scanner;
public class SumArray{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("Matrix");
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
            System.out.println(sum+" ");

        }

    }
}


