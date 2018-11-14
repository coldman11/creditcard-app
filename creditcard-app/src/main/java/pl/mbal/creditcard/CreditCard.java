package pl.mbal.creditcard;

class CreditCard {
    
    boolean blocked = false;
    int limit;
    
    public void assignLimit(double money) {
        this.limit = money;
    }
    
    public double getLimit() {
        return limit;
    }
    
    public void block()
    {
        this.blocked = true;
    }
    
    public boolean isBlocked()
    {
        return blocked;
    }
       public void withdraw(int money)
    {
        this.limit = this.limit - money;
    }
}