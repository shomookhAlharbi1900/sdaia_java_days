package Day2;

public class Account {
    String name ;
    private double balance ;
     static  double rate = 4.04 ;
    public Account (String n , double b){
        this.name=n ;
        this.balance = b;
    }
    public double getmonthlyRate () {
        return rate /12 ;
    }
    public double getmonthlyInt(){
       return balance * getmonthlyRate();
    }
    public void depoist( double amt) {
        balance = balance + amt ;
    }
    public void withdrae( double amt) {
        balance = balance - amt ;
    }
    public double getBalance (){
        return balance ;
    }






}
