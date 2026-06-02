class Student{
    String name;
    int age;
    Student(){
        name="preethi";
        age=20;
    }
    Student(String n,int a){
        name=n;
        age=a;
    }
    public void disp(){
        System.out.println("Name:" + name+"Age:" +age);
    }
}
public class Constructor{
    public static void main(String[] args){
        Student stud=new Student("geetha",43);
        System.out.println(stud.name);
        System.out.println(stud.age);
        stud.disp();


    }
}