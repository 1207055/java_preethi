interface Payment {
     void makePayment();
    
}

class Phonepe implements Payment{
     public void makePayment(){
        System.out.println("Payment is done using phonepe");
    }
    
}
class GooglePay implements Payment{
     public void makePayment(){
        System.out.println("Payment is done using googleplay");
    }
    
}
class Paytm implements Payment{
     public void makePayment(){
        System.out.println("Payment is done using Paytm");
    }
    
}


public class ExInter{
    public static void main(String args[]){
        Phonepe c=new Phonepe();
        c.makePayment();
        GooglePay c1=new GooglePay();
        c1.makePayment();
        Paytm c2=new Paytm();
        c2.makePayment();
    }
}