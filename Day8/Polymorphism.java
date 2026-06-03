class Caluclator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

}
public class Polymorphism{
    public static void main(String args[]){
        Caluclator ca=new Caluclator();
        System.out.println(ca.add(2,4));
        System.out.println(ca.add(2,4,6));



    }
}