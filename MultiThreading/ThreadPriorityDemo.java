package ThreadCreation;

	class DemoThread extends Thread {

	    DemoThread(String name) {
	        super(name);
	    }

	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(getName() + " : " + i);
	        }
	    }
	}

	public class ThreadPriorityDemo {

	    public static void main(String[] args) {

	        DemoThread t1 = new DemoThread("MAX");
	        DemoThread t2 = new DemoThread("MIN");
	        DemoThread t3 = new DemoThread("NORM");

	        t1.setPriority(Thread.MAX_PRIORITY);
	        t2.setPriority(Thread.MIN_PRIORITY);
	        t3.setPriority(Thread.NORM_PRIORITY);

	        t1.start();
	        t2.start();
	        t3.start();
	    }
	}