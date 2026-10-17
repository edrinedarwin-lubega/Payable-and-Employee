public interface Payable {
    double getPaymentAmount();
}

public abstract class Employee implements Payable {
    private String staffId;
    private String name;

    public Employee(String staffId, String name) {
        this.staffId = staffId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getStaffId() {
        return staffId;
    }

    public abstract double calculatePay();

    @Override
    public double getPaymentAmount() {
        return calculatePay();
    }

    @Override
    public String toString() {
        return "Staff ID: " + staffId + ", Name: " + name;
    }
}