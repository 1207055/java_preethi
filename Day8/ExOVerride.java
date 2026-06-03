class vehicle{
    public void start(){
        System.out.println("vehicle started");

    }
}
class Car extends vehicle{
    public void start(){
        System.out.println("Car started");
    }

}
class Bike extends vehicle{
    public void start(){
        System.out.println("bike started");
    }

}
class Bus extends vehicle{
    public void start(){
        System.out.println("Bus started");
    }

}
public class ExOverride{
    public static void main(String args[]){
        Car c=new Car();
        c.start();
        Bike b=new Bike();
        b.start();
        Bus bs=new Bus();
        bs.start();
    }
}