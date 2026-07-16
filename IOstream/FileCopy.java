package iostream;

	import java.io.*;
	import java.util.*;

	public class FileCopy {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the input file name");
	        String inputFile = sc.nextLine();

	        System.out.println("Enter the output file name");
	        String outputFile = sc.nextLine();

	        try {
	            FileReader fr = new FileReader(inputFile);
	            FileWriter fw = new FileWriter(outputFile);

	            int c;
	            while ((c = fr.read()) != -1) {
	                fw.write(c);
	            }

	            fr.close();
	            fw.close();

	            System.out.println("File is copied.");

	        } catch (IOException e) {
	            System.out.println(e);
	        }

	        sc.close();
	    }
	}