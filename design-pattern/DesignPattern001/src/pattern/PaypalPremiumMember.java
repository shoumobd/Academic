package pattern;

public class PaypalPremiumMember implements PaymentMethod{
    static double paypal_premium_discount_rate=0.3;
    double promo_code;

    @Override
    public void applyPromoCode(double value) {
        promo_code= value;
    }

    @Override
    public double payableAmount(double base_amount) {
        return base_amount * (1 - paypal_premium_discount_rate) - promo_code;
    }

    @Override
    public void makePayment(double amount) {
        System.out.print("Membership type: Premium,\nMaking Paypal Payment of "+amount+" BDT.\n");
    }
}
