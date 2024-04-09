public class Mobile {

    public static void main(String args[]) {
        Brand samsung = new Brand();

        samsung.ram = 4;
        samsung.cameraPixel = 24;
        samsung.isWifiEnabled = true;
        samsung.version = " Android 12 ";
        System.out.println("Ram is " + samsung.ram + "Gb");
        System.out.println("Camera Pixel is " + samsung.cameraPixel + "Gb");
        System.out.println("Is Wifi is Connected to samsung Mobile" + samsung.isWifiEnabled + "");
        System.out.println("Version is " + samsung.version);
        samsung.setBattery(78);
        samsung.call();
        samsung.playGame();
    }
}

class Brand {

    int ram;
    // int battery;
    String version;
    float cameraPixel;
    boolean isWifiEnabled = false;

    public void call() {
        System.out.println("Mobile is Ringing");
    }

    public void setBattery(int battery) {
        System.out.println(" Battery is " + battery + " %");
    }

    public void playGame() {
        System.out.println(" Start playing game");
    }
}