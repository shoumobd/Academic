package pattern;

public class PremiumPaymentFactory extends AbstractFactory{
    @Override
    public Context getPaymentType(String payment_type){
        if(payment_type==null){
            return null;
        }
        else if(payment_type.equalsIgnoreCase("credit card")){
            return new Context(new CreditCardPremiumMember());
        }
        else if(payment_type.equalsIgnoreCase("paypal")){
            return new Context(new PaypalPremiumMember());
        }
        return null;
    }
}
