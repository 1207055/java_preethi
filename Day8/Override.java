class Animal{
    public void makeSound(){
        System.out.println("Animal sound");
    }
    

}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("dog Barks");
    }

}
public class Override{
    public static void main(String args[]){
        Dog ca=new Dog();
        ca.makeSound();



    }
}