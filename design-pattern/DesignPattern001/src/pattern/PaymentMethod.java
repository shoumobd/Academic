package pattern;

public interface PaymentMethod {
    public void applyPromoCode(double value);
    public double payableAmount(double base_amount);
    public void makePayment(double amount);
}
