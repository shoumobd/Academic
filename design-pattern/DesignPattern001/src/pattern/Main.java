package pattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Membership Type: ");
    String membership_type = input.nextLine();
    AbstractFactory payment_factory1 = FactoryProducer.getFactory(membership_type);
    System.out.print("Enter Payment Method: ");
    String payment_type = input.nextLine();
	Context context1 = payment_factory1.getPaymentType(payment_type);
    System.out.print("Enter Base Payable Amount: ");
    double base_amount = input.nextDouble();
    System.out.print("Enter Promo Value: ");
    double promo_value = input.nextDouble();
    context1.applyPromo(promo_value);
    double final_amount = context1.getPayableAmount(base_amount);
    context1.doPayment(final_amount);
    }
}
