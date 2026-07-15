package Overriding;

// Base Class (Now the main public class)
public class Fruit {
    String name, taste, size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }

    public static void main(String[] args) {
        Apple a = new Apple();
        Orange o = new Orange();
        
        a.eat();
        o.eat();
    }
}

// Subclass 1
class Apple extends Fruit {
    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Apple tastes Sweet");
    }
}

// Subclass 2
class Orange extends Fruit {
    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Orange tastes Sour");
    }
}
