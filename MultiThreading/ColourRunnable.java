package ThreadCreation;
import java.util.Random;

class ColourTask implements Runnable {

    public void run() {

        String colours[] = {
                "white",
                "blue",
                "black",
                "green",
                "red",
                "yellow"
        };

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                System.out.println("Red occurred. Stopping...");
                break;
            }
        }
    }
}

public class ColourRunnable {

    public static void main(String[] args) {

        Thread t = new Thread(new ColourTask());
        t.start();
    }
}