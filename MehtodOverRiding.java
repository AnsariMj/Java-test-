class calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvanceCalculator  extends calculator{
    public int add1(int a, int b) {
        return a + b + 1;
    }
}

public class MehtodOverRiding extends calculator {
    public static void main(String[] args) {

        AdvanceCalculator calculate = new AdvanceCalculator();
        int sum = calculate.add(10, 5);
        System.out.println(" sum = " + sum);

    }
}
