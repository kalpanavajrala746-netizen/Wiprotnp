package streamapi;
	import java.util.*;
	import java.util.stream.Collectors;

	class Employee {
	    int empNo;
	    String name;
	    int age;
	    String location;

	    Employee(int empNo, String name, int age, String location) {
	        this.empNo = empNo;
	        this.name = name;
	        this.age = age;
	        this.location = location;
	    }

	    public String toString() {
	        return empNo + " " + name + " " + age + " " + location;
	    }
	}

	public class EmployeeFilter {

	    public static void main(String[] args) {

	        ArrayList<Employee> list = new ArrayList<>();

	        list.add(new Employee(101, "Kalpana", 22, "Pune"));
	        list.add(new Employee(102, "Ravi", 25, "Hyderabad"));
	        list.add(new Employee(103, "Anitha", 24, "Pune"));
	        list.add(new Employee(104, "Kiran", 23, "Chennai"));
	        list.add(new Employee(105, "Rahul", 26, "Pune"));

	        ArrayList<Employee> result = list.stream()
	                .filter(e -> e.location.equals("Pune"))
	                .collect(Collectors.toCollection(ArrayList::new));

	        result.forEach(System.out::println);
	    }
	}