class Student{
    private String  name;
    private int age;
    private double salary;
    public  void setBal(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;

    }
    public  String getName(){
        return name;
        
    } 
    public  int getAge(){
        return age;
        
    } 
    public  double getSal(){
        return salary;
        
    }  
}
public class EncapEx{
    public static void main(String args[]){
        Student s1=new Student();
        s1.setBal("preethi",20,100000);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSal());

    }
}