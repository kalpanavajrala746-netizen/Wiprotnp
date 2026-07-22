package MultiThreadingMiniProject;
	class Hare extends Thread {

	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Hare : Step " + i);

	            if (i == 5) {
	                try {
	                    System.out.println("Hare is sleeping...");
	                    Thread.sleep(2000);
	                } catch (InterruptedException e) {
	                }
	            }
	        }
	        System.out.println("Hare Finished!");
	    }
	}

	class Tortoise extends Thread {

	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Tortoise : Step " + i);

	            try {
	                Thread.sleep(500);
	            } catch (InterruptedException e) {
	            }
	        }
	        System.out.println("Tortoise Finished!");
	    }
	}

	public class HareTortoiseRace {

	    public static void main(String[] args) {

	        Hare hare = new Hare();
	        Tortoise tortoise = new Tortoise();

	        hare.start();
	        tortoise.start();

	        try {
	            hare.join();
	            tortoise.join();
	        } catch (InterruptedException e) {
	        }

	        System.out.println("Race Over!");
	    }
	}
