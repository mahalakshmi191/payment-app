public class PaymentApp {

    public static void main(String[] args) {

        String flag = System.getenv("FEATURE_PAYMENT_V2");

        if ("true".equalsIgnoreCase(flag)) {
            System.out.println("🚀 New Payment Flow Enabled");
        } else {
            System.out.println("Old Payment Flow");
        }
    }
}