package Overriding;

// Base Class (Now the main public entry point)
public class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
    
    void erase() {
        System.out.println("Erasing Shape");
    }

    public static void main(String[] args) {
        // Polymorphic references inside the main method
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();
        
        c.draw();
        c.erase();
        
        t.draw();
        t.erase();
        
        s.draw();
        s.erase();
    }
}

// Subclass 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
    
    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

// Subclass 2
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
    
    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

// Subclass 3
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
    
    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}
