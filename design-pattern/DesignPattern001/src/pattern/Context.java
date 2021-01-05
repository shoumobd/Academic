package pattern;

public class Context {
    private PaymentMethod payment_method;
    public Context(PaymentMethod payment_method){
        this.payment_method=payment_method;
    }
    public void applyPromo(double value) {
        payment_method.applyPromoCode(value);
    }
    public double getPayableAmount(double base_amount){
        return payment_method.payableAmount(base_amount);
    }
    public void doPayment(double amount){
        payment_method.makePayment(amount);
    }
}
