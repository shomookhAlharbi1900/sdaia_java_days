package Day2;

public class CheckedAccount extends  Account{
    public CheckedAccount(String n, double b) {
        super(n, b);
    }

    @Override
    public void withdrae(double amt) {
        if (getBalance() - amt >= 0) {
            super.withdrae(amt);
        }

    }
}
