class BankAc{
    private double balance=0;
    public void setBal(int amt){
        balance+=amt;
    }
    public double getBal(){
        return balance;
    }
}
public class Encapuslation{
    public static void main(String args[]){
        BankAc acc=new BankAc();
        acc.setBal(1000);
        System.out.println(acc.getBal());
    }
}