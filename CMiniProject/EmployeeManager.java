package employee;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class EmployeeManager {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        ArrayList<Employee> employees = new ArrayList<>();

	        System.out.print("Enter number of employees: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {

	            System.out.print("Enter Employee ID: ");
	            int id = sc.nextInt();

	            System.out.print("Enter Employee Name: ");
	            String name = sc.next();

	            System.out.print("Enter Employee Salary: ");
	            double salary = sc.nextDouble();

	            employees.add(new Employee(id, name, salary));
	        }

	        System.out.println("\nEmployee Details");

	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }

	        sc.close();
	    }
	}