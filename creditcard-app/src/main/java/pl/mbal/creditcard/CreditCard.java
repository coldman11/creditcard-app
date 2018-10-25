package pl.mbal.creditcard;

class CreditCard {
    
    boolean status = true;
    
    public void assignLimit(double money) {
        
    }
    
    public double getLimit() {
        return 2000;
    }
    
    public void block()
    {
        this.status = false;
    }
}