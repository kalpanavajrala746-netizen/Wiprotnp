package MiniProject;
	import java.util.ArrayList;
	public class Main {
		public static void main(String[] args) {
			UserDAO dao = new UserDAO();
			String[] names = dao.getNames();
			if (names != null) {
			    for (String name : names) {
			        System.out.println(name);
			    }
	        }
		}
	}