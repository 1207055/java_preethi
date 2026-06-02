class Student{
    String name;
    int age;
    Student(){
        name="preethi";
        age=20;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    Student(String name){
        this.name=name;
        age=22;
    }
    public void disp(){
        System.out.println("Name:" + name+"Age:" +age);
    }
}
public class ThisKey{
    public static void main(String[] args){
        Student stud=new Student("geetha",43);
        System.out.println(stud.name);
        System.out.println(stud.age);
        stud.disp();


    }
}