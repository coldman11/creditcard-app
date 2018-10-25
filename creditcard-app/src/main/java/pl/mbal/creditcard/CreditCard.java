package pl.mbal.creditcard;

class CreditCard {
    
    boolean blocked = false;
    
    public void assignLimit(double money) {
        
    }
    
    public double getLimit() {
        return 2000;
    }
    
    public void block()
    {
        this.blocked = true;
    }
    
    public boolean isBlocked()
    {
        return blocked;
    }
}