package Inheritance;

// Base Class
class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
    
    public void sleep() {
        System.out.println("Animal sleeps");
    }
}

// Subclass inheriting from Animal
class Bird extends Animal {
    public void fly() {
        System.out.println("Bird flies");
    }
}

// Main Driver Class (File must be saved exactly as AnimalTest.java)
public class AnimalTest {
    public static void main(String[] args) {
        Bird b = new Bird();
        
        // Calling inherited methods from Animal class
        b.eat();
        b.sleep();
        
        // Calling Bird's own method
        b.fly();
    }
}
