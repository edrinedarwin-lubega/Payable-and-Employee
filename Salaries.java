public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String staffId, String name, double salary) {
        super(staffId, name);
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.monthlySalary = salary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

public class HourlyEmployee extends Employee {
    private int hours;
    private double rate;

    public HourlyEmployee(String staffId, String name, int hours, double rate) {
        super(staffId, name);
        if (hours < 0 || rate < 0) {
            throw new IllegalArgumentException("Hours and rate cannot be negative.");
        }
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculatePay() {
        return hours * rate;
    }
}