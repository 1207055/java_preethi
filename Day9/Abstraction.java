abstract class Vehicle{
    abstract void start();
    public void Stop(){
        System.out.println("Stopped");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car Started");
    }
}
public class Abstraction{
    public static void main(String args[]){
        Car c=new Car();
        c.start();
    }
}