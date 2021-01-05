package pattern;

public class CreditCardPremiumMember implements PaymentMethod{
    static double card_premium_discount_rate=0.4;
    double promo_code;

    @Override
    public void applyPromoCode(double value) {
        promo_code= value;
    }

    @Override
    public double payableAmount(double base_amount) {
        return base_amount * (1 - card_premium_discount_rate) - promo_code;
    }

    @Override
    public void makePayment(double amount) {
        System.out.print("Membership type: Premium,\nMaking Credit Card Payment of "+amount+" BDT.\n");
    }
}
