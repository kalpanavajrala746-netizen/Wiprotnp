package streamapi;


	import java.util.*;
	import java.util.stream.Collectors;

	class Student {
	    int rollNo;
	    String name;
	    int mark;

	    Student(int rollNo, String name, int mark) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.mark = mark;
	    }

	    public String toString() {
	        return rollNo + " " + name + " " + mark;
	    }
	}

	public class StudentFilter {

	    public static void main(String[] args) {

	        ArrayList<Student> list = new ArrayList<>();

	        list.add(new Student(1, "Kalpana", 85));
	        list.add(new Student(2, "Ravi", 45));
	        list.add(new Student(3, "Anitha", 65));
	        list.add(new Student(4, "Kiran", 40));
	        list.add(new Student(5, "Rahul", 75));

	        List<Student> passed = list.stream()
	                .filter(s -> s.mark >= 50)
	                .collect(Collectors.toList());

	        passed.forEach(System.out::println);

	        System.out.println("Passed Count = " + passed.size());
	    }
	}
