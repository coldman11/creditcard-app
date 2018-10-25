package pl.mbal.creditcard;

class CreditCard {
    
    boolean status = false;
    
    public void assignLimit(double money) {
        
    }
    
    public double getLimit() {
        return 2000;
    }
    
    public void block()
    {
        this.status = false;
    }
    
    public boolean isBlocked()
    {
        return status;
    }
}