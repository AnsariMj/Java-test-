package Java.Constructor;

class Box {
    double width;
    double height;
    double depth;

    // compute and return volume
    double getVolume() {
        return width * height * depth;
    }

    // Constructor
    Box() {
        System.out.println(" Constructing Box");
        width = 4;
        height = 40;
        depth = 99;
    }
    // // set dimension of the box
    // void setDimension(double w, double h, double d) {
    // width = w;
    // height = h;
    // depth = d;
    // }
}

public class BoxDemo {
    public static void main(String args[]) {
        Box myBox1 = new Box();
        // myBox1.setDimension(4, 4, 8);
        double vol = myBox1.getVolume();
        System.out.println("Volume: " + vol);
    }
}
