public class PayrollTest {
    public static void main(String[] args) {
        Payable[] payroll = {
            new SalariedEmployee("E001", "Alice Namubiru", 2500000),
            new HourlyEmployee("E002", "John Kato", 40, 25000)
        };

        double totalPayroll = 0.0;
        for (Payable p : payroll) {
            double payment = p.getPaymentAmount();
            System.out.println(p.toString() + " - Payment: UGX " + payment);
            totalPayroll += payment;
        }
        System.out.println("Total Payroll: UGX " + totalPayroll);
    }
}