package pl.mbal.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardRepositoryTest {
    private static final String ID = "my_id";
    
    @Test
    public void allowAddAndLoadCC() {
        CreditCard card = new CreditCard(ID);
        
        CreditCardRepository repository = 
            new CreditCardRepository();
            
        repository.add(card);
        
        CreditCard loaded = repository.find(ID);
        
        Assert.assertEquals(loaded.getId(), ID);
    }
}