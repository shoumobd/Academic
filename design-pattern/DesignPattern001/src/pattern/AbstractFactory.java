package pattern;

public abstract class AbstractFactory {
    abstract Context getPaymentType(String payment_type);
}
