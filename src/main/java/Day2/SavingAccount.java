package Day2;

public class SavingAccount extends Account {
    private  double limit ;

    public SavingAccount(String n, double b, double limit) {
        super(n, b);
        this.limit = limit;
    }

    @Override
    public void withdrae(double amt) {
        if (getBalance() - amt >= limit) {
            super.withdrae(amt);

        }
    }
}
