package OptionalClass;

import java.util.Optional;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class InvalidEmployeeException extends RuntimeException {
    InvalidEmployeeException(String msg) {
        super(msg);
    }
}

public class OptionalExample3 {
    public static void main(String[] args) {
        // Scenario 1: Handling a null employee safely using try-catch
        try {
            Employee emp1 = null;
            System.out.println("Testing Scenario 1 (Null Employee):");
            
            Employee e1 = Optional.ofNullable(emp1)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));
            
            System.out.println("Employee Name: " + e1.name);
        } catch (InvalidEmployeeException ex) {
            System.out.println("Caught Expected Error: " + ex.getMessage());
        }

        System.out.println("\n-----------------------------------\n");

        // Scenario 2: Passing a valid employee object
        try {
            Employee emp2 = new Employee("Kalpana");
            System.out.println("Testing Scenario 2 (Valid Employee):");
            
            Employee e2 = Optional.ofNullable(emp2)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));
            
            System.out.println("Employee Name: " + e2.name);
        } catch (InvalidEmployeeException ex) {
            System.out.println("Caught Error: " + ex.getMessage());
        }
    }
}
