class Car {

  public void drive() {
    System.out.println(" Car is driving");
  }
}

class Thar extends Car {

  public void drive() {
    System.out.println(" Thar Car is  being driven");
  }
}

public class PolymorphismThar {

  public static void main(String[] args) {
    Car Thar = new Thar();
    Thar.drive();
  }
}
