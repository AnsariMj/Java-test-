
public class MobileConstructor {
    int ram;
    int battery;
    String version;
    double cameraPixel;
    boolean isWifiEnabled;

    public MobileConstructor(int ram, int battery, String version, double cameraPixel, boolean isWifiEnabled) {
        this.ram = ram;
        this.battery = battery;
        this.version = version;
        this.cameraPixel = cameraPixel;
        this.isWifiEnabled = isWifiEnabled;
    }

    public void displayMobileDetails() {
        System.out.println("MObile Ram is " + ram + "Gb");
        System.out.println("MObile Battery is " + battery + "%");
        System.out.println("MObile Version is Android " + battery);
        System.out.println("MObile Camera Pixel " + cameraPixel);
        System.out.println("MObile Wifi iS Working" + isWifiEnabled);

    }

    public static void main(String args[]) {
        MobileConstructor Samsung = new MobileConstructor(8, 99, "12", 15, true);
        Samsung.displayMobileDetails();
        MobileConstructor Apple = new MobileConstructor(8, 99, "12", 15, true);
        Apple.displayMobileDetails();
    }

}
