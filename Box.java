package classesandobjects;

public class Box {
    // Instance variables
    int width, height, depth;

    // Parameterized Constructor
    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    int getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Creating an object and passing values to the constructor
        Box b = new Box(10, 5, 2);

        // Printing dimensions and volume
        System.out.println("Width = " + b.width);
        System.out.println("Height = " + b.height);
        System.out.println("Depth = " + b.depth);
        System.out.println("Volume = " + b.getVolume());
    }
}
