public class Main {
    public static void main(String[] args) {
    CreditPaymentService service = new CreditPaymentService();

    int payment = (int) service.calculate(1_000_000,12,9.99);
        System.out.println(payment);

    int payment2 = (int) service.calculate(1_000_000,24,9.99);
        System.out.println(payment2);

    int payment3 = (int) service.calculate(1_000_000,36,9.99);
        System.out.println(payment3);

    }
}