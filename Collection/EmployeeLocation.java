package Functionalinterface;

	import java.util.*;
	import java.util.function.Function;
	import java.util.stream.Collectors;

	class Employee {
	    int id;
	    String name, location;
	    double salary;

	    Employee(int id, String name, String location, double salary) {
	        this.id = id;
	        this.name = name;
	        this.location = location;
	        this.salary = salary;
	    }
	}

	public class EmployeeLocation {
	    public static void main(String[] args) {

	        ArrayList<Employee> list = new ArrayList<>();

	        list.add(new Employee(1,"A","Pune",25000));
	        list.add(new Employee(2,"B","Hyd",30000));
	        list.add(new Employee(3,"C","Delhi",35000));
	        list.add(new Employee(4,"D","Chennai",20000));
	        list.add(new Employee(5,"E","Mumbai",45000));

	        Function<Employee,String> f = e -> e.location;

	        ArrayList<String> locations = list.stream()
	                .map(f)
	                .collect(Collectors.toCollection(ArrayList::new));

	        System.out.println(locations);
	    }
	}