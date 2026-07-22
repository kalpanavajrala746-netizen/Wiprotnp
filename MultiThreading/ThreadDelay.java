package ThreadCreation;
	class NumberThread extends Thread {

	    public void run() {
	        try {
	            for (int i = 1; i <= 10; i++) {
	                System.out.println(i);

	                if (i == 5) {
	                    Thread.sleep(5000);
	                }
	            }
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
	    }
	}

	public class ThreadDelay {

	    public static void main(String[] args) {
	        NumberThread t = new NumberThread();
	        t.start();
	    }
	}