class Car{
    String brand;
    String speed;
    public void drive(){
        System.out.println("Brand:" + brand+"Speed:" +speed);
    }
}
public class Obj1{
    public static void main(String[] args){
        Car car1=new Car();
        car1.brand="BMW";
        car1.speed="20km/hr";
        System.out.println(car1.brand);
        System.out.println(car1.speed);
        car1.drive();


    }
}