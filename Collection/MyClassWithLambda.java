package LambdaExpressions;

	interface WordCount {
	    int count(String str);
	}

	public class MyClassWithLambda {

	    public static void main(String[] args) {

	        WordCount wc = str -> str.trim().split("\\s+").length;

	        String s = "Welcome to Java Full Stack";

	        System.out.println("Sentence : " + s);
	        System.out.println("Word Count : " + wc.count(s));
	    }
	}