package pattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory_type){
        if(factory_type.equalsIgnoreCase("Premium")){
            return new PremiumPaymentFactory();
        }
        else if(factory_type.equalsIgnoreCase("Standard")) {
            return new StandardPaymentFactory();
        }
        return null;
    }
}
