package employee;

	import java.util.Scanner;

	public class EmployeeManagement {

	    public static void main(String[] args) throws Exception {

	        Scanner sc = new Scanner(System.in);

	        Employee emp[] = new Employee[3];

	        try {
	            for (int i = 0; i < 3; i++) {

	                System.out.println("Enter Employee Id:");
	                int id = sc.nextInt();

	                if (id <= 0)
	                    throw new Exception("Invalid Employee Id");

	                System.out.println("Enter Employee Name:");
	                String name = sc.next();

	                System.out.println("Enter Employee Salary:");
	                double salary = sc.nextDouble();

	                if (salary < 0)
	                    throw new Exception("Invalid Salary");

	                emp[i] = new Employee(id, name, salary);
	            }

	            System.out.println("\nEmployee Details");

	            for (Employee e : emp) {
	                e.display();
	            }

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        sc.close();
	    }
	}