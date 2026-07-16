package Wrapper;
	class Employee implements Cloneable {

	    int id;
	    String name;
	    double salary;

	    Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	    }
	}

	public class EmployeeClone {

	    public static void main(String[] args) {

	        try {
	            Employee emp1 = new Employee(101, "Kalpana", 30000);

	            Employee emp2 = (Employee) emp1.clone();

	            // Change original object
	            emp1.id = 102;
	            emp1.name = "Kavya";
	            emp1.salary = 45000;

	            System.out.println("Original Employee:");
	            emp1.display();

	            System.out.println("\nCloned Employee:");
	            emp2.display();

	            System.out.println("\nObservation:");
	            System.out.println("Changes made to the original object do not affect the cloned object.");

	        } catch (CloneNotSupportedException e) {
	            System.out.println(e);
	        }
	    }
	}