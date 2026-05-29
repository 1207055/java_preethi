public class UsingObj{
    public  int addNum(int a,int b){
        int c=a+b;
        return c;
    }
    public static void  main(String args[]){
        UsingObj a=new UsingObj();
        System.out.println(a.addNum(11,22));
    }
}