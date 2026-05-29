public class MethodOverloading{
    public  int addNum(int a,int b){
        int c=a+b;
        return c;
    }
     public  int  addNum(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
    static void change(int x){
        x=500;
        System.out.println("Inside method:"+x);
    }
    public static void  main(String args[]){
        int y=5;
        change(y);
        System.out.println("Outside Method:"+y);
        Add1 a=new Add1();
        System.out.println(a.addNum(11,22,33));
    }
}