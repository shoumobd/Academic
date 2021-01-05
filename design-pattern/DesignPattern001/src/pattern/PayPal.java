package pattern;

public class PayPal implements PaymentMethod{
    static double paypal_discount_rate=0.1;
    double promo_code;

    @Override
    public void applyPromoCode(double value) {
        promo_code= value;
    }

    @Override
    public double payableAmount(double base_amount) {
        return base_amount * (1 - paypal_discount_rate) - promo_code;
    }

    @Override
    public void makePayment(double amount) {
        System.out.print("Making Paypal Payment of "+amount+" BDT.\n");
    }
}
