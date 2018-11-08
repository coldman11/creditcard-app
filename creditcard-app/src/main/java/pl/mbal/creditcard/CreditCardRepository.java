package pl.mbal.creditcard;
import java.util.HashMap;
import java.util.Map;

public class CreditCardRepository
{
    private Map<String, CreditCard> cards = new HashMap<String, CreditCard>();
    public void add(CreditCard card)
    {
        cards.put(card.getId(), card);
    }
    
    public CreditCard find(String id)
    {
        return cards.get(id);
    }
}