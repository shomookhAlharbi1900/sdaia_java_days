package Day2;

public class mainAccount {
    public static void main(String[] args) {
        Account x = new Account("Shmookh",2500);
        SavingAccount s = new SavingAccount("jood",5000,100);

        s.withdrae(100);
        System.out.println( x.name);
        System.out.println( s.getBalance());
        x.depoist(500);
        System.out.println( x.getBalance());
        System.out.println( x.getmonthlyRate());











    }
}