public class RunnableThreadEg implements Runnable {

  public void run() {
    System.out.println(" Runnable Thread is Running");
  }

  public static void main(String[] args) {
    RunnableThreadEg thread1 = new RunnableThreadEg();
    Thread runThread = new Thread(thread1);
    runThread.start();
  }
}
