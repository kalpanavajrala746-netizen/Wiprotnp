package Inheritance;

// 1. Base Class (Keep it package-private, outside TestEmployee)
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// 2. Derived Class (Keep it package-private, outside TestEmployee)
class Employee extends Person {
    private double annualSalary;
    private int year;
    private String insuranceNumber;

    public Employee(String name, double annualSalary, int year, String insuranceNumber) {
        super(name); // Invokes the constructor of the Person class
        this.annualSalary = annualSalary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
}

// 3. Execution Class (The only public class, matching the filename TestEmployee.java)
public class TestEmployee {
    public static void main(String[] args) {
        
        // This will now compile perfectly
        Employee e = new Employee("Kalpana", 50000, 2025, "INS1001");

        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getAnnualSalary());
        System.out.println("Year: " + e.getYear());
        System.out.println("Insurance No: " + e.getInsuranceNumber());
    }
}
