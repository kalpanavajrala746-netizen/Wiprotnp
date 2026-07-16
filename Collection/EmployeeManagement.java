package list;

	import java.util.ArrayList;

	class Employee {

	    int empId;
	    String empName;
	    String email;
	    String gender;
	    float salary;

	    Employee(int empId, String empName, String email, String gender, float salary) {
	        this.empId = empId;
	        this.empName = empName;
	        this.email = email;
	        this.gender = gender;
	        this.salary = salary;
	    }

	    void getEmployeeDetails() {
	        System.out.println("ID : " + empId);
	        System.out.println("Name : " + empName);
	        System.out.println("Email : " + email);
	        System.out.println("Gender : " + gender);
	        System.out.println("Salary : " + salary);
	    }
	}

	class EmployeeDB {

	    ArrayList<Employee> list = new ArrayList<>();

	    boolean addEmployee(Employee e) {
	        return list.add(e);
	    }

	    boolean deleteEmployee(int empId) {

	        for (Employee e : list) {
	            if (e.empId == empId) {
	                list.remove(e);
	                return true;
	            }
	        }
	        return false;
	    }

	    String showPaySlip(int empId) {

	        for (Employee e : list) {
	            if (e.empId == empId) {
	                return "Pay Slip\nEmployee ID : " + e.empId +
	                        "\nEmployee Name : " + e.empName +
	                        "\nSalary : " + e.salary;
	            }
	        }
	        return "Employee Not Found";
	    }
	}

	public class EmployeeManagement {

	    public static void main(String[] args) {

	        EmployeeDB db = new EmployeeDB();

	        Employee e1 = new Employee(101, "Kalpana", "kalpana@gmail.com", "Female", 50000);

	        db.addEmployee(e1);

	        e1.getEmployeeDetails();

	        System.out.println();

	        System.out.println(db.showPaySlip(101));

	        db.deleteEmployee(101);
	    }
	}