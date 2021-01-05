package pattern;

public class CreditCard implements PaymentMethod{
    static double card_discount_rate=0.2;
    double promo_code;

    @Override
    public void applyPromoCode(double value) {
        promo_code= value;
    }

    @Override
    public double payableAmount(double base_amount) {
        return base_amount * (1 - card_discount_rate) - promo_code;
    }

    @Override
    public void makePayment(double amount) {
        System.out.print("Making Credit Card Payment of "+amount+" BDT.\n");
    }
}
