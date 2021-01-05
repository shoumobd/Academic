package pattern;

public class StandardPaymentFactory extends AbstractFactory{
    @Override
    public Context getPaymentType(String payment_type){
        if(payment_type==null){
            return null;
        }
        else if(payment_type.equalsIgnoreCase("credit card")){
            return new Context(new CreditCard());
        }
        else if(payment_type.equalsIgnoreCase("paypal")){
            return new Context(new PayPal());
        }
        return null;
    }
}
