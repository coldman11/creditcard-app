package pl.mbal.creditcard;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class CreditCardApiTest
{
    private static final double INITIAL_CREDIT = 200;
    private static final String ID = "123456789";
    private CreditCardRepository repository;
    private CreditCardApi api;

    @Test
    public void withdrawFromCard()
    {
        thereIsRepository();
        thereIsCreditCardApi();
        thereIsCardWithId(ID);
        
        api.withdraw(ID, 20);
        
        ballanceOfCardWithIdEquals(ID, 180);
    }
    
    private void thereIsCardWithId(String id)
    {
        CreditCard card = new CreditCard(id);
        card.assignLimit(BigDecimal.valueOf(INITIAL_CREDIT));
        
        repository.add(card);
    }
    
    private void thereIsCreditCardApi()
    {
        this.api = new CreditCardApi(repository);
    }
    
    private void thereIsRepository()
    {
        this.repository = new CreditCardRepository();
    }
    
    private void ballanceOfCardWithIdEquals(String id, double money)
    {
        CreditCard card = repository.find(id);
        
        Assert.assertEquals(
            BigDecimal.valueOf(money),
            card.getBalance());
    }
    
}