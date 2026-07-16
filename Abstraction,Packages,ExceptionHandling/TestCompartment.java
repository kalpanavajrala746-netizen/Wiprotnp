package AbstractClasses;

// 1. Move imports to the very top of the file
import java.util.Random;

public class TestCompartment {

    // 2. Make inner classes static so the static main method can instantiate them
    static abstract class Compartment {
        public abstract String notice();
    }

    static class FirstClass extends Compartment {
        @Override
        public String notice() {
            return "First Class";
        }
    }

    static class Ladies extends Compartment {
        @Override
        public String notice() {
            return "Ladies";
        }
    }

    static class General extends Compartment {
        @Override
        public String notice() {
            return "General";
        }
    }

    static class Luggage extends Compartment {
        @Override
        public String notice() {
            return "Luggage";
        }
    }

    // 3. Removed the duplicate "public class TestCompartment" declaration here
    public static void main(String[] args) {

        Compartment[] c = new Compartment[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(4) + 1;

            switch (n) {
                case 1:
                    c[i] = new FirstClass();
                    break;
                case 2:
                    c[i] = new Ladies();
                    break;
                case 3:
                    c[i] = new General();
                    break;
                case 4:
                    c[i] = new Luggage();
                    break;
            }

            System.out.println(c[i].notice());
        }
    }
}
