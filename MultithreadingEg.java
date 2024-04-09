public class MultithreadingEg extends Thread {

  public void run() {
    System.out.println(" Thread started");
  }

  public static void main(String[] args) {
    MultithreadingEg thread1 = new MultithreadingEg();
    thread1.start();
  }
}
