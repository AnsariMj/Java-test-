
class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("This is a " + name + " and it tastes " + taste + ".");
    }
}


class Apple extends Fruit {
    public Apple(String name, String size) {
        super(name, "sweet", size);
    }

    @Override
    public void eat() {
        System.out.println("This is an " + name + " and it tastes " + taste + ".");
    }
}


class Orange extends Fruit {
    public Orange(String name, String size) {
        super(name, "tangy", size);
    }

    @Override
    public void eat() {
        System.out.println("This is an " + name + " and it tastes " + taste + ".");
    }
}

public class mafru {
    public static void main(String[] args) {
        Apple apple = new Apple("Apple", "medium");
        Orange orange = new Orange("Orange", "large");

        apple.eat(); 
        orange.eat(); 
    }
}
