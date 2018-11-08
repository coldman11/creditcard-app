package pl.mbal.creditcard;

import java.math.BigDecimal;
public class CreditCardApi
{
    CreditCardRepository creditCardRepository;
    
    public CreditCardApi(CreditCardRepository creditCardRepository)
    {
        this.creditCardRepository = creditCardRepository;
    }
    public void withdraw(String id, double money)
    {
        creditCardRepository.find(id).withdraw(BigDecimal.valueOf(money));
    }
}