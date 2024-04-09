
public class JavaBasicProgram {
    void showDemo() {
        System.out.println(" I am in the showDemo method");
    }

    JavaBasicProgram() {
        System.out.println(" This this the Constructor method");
    }

    public static void main(String[] args) {

        // Array
        // String a[] = { "mj ", " jILAI" };
        // System.out.println(a);
        // int a[] = new int[4];
        // a[3] = 4;
        // for (int i = 0; i < a.length; i++) {
        // System.out.println(" Output " + a[i]);
        // }

        // for each loop { it can traverse the reverse order and don't skip any elements
        // because it doesn't have indexing informatio}
        String Name[] = { "MJ", " Jilani", " Hasnain", "Sonu" };
        System.out.println("-------Program No. 1--------");
        for (String name : Name) {
            System.out.println(name);
        }

        // Object Oriented Methods

        JavaBasicProgram obj;
        obj = new JavaBasicProgram();
        System.out.println("--------Program No. 2---------");

        obj.showDemo();
        // .
        // .
        // .
        // .
        // .

        // Overloading
        System.out.println("--------Program No. 3---------Overloading");

        System.out.println("Output:" + sum(5, 5));
        // System.out.println(sum(5, 5, 8));
        // System.out.println(sum(5, 5, 8, 5));

        // OverRiding
        System.out.println("--------Program No. 4---------OverRiding");

    }

    // ------------------------------------OVerloading Methods
    static int sum(int a, int b) {
        return (a + b);
    }

    static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    static int sum(int a, int b, int c, int d) {
        return (a + b + c + d);
    }

}
