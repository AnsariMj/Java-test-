class ThreadDemo extends Thread {

  String threadName;

  ThreadDemo(String s) {
    threadName = s;
  }
}

public class ThreadPrority {

  public static void main(String[] args) {
    ThreadDemo t1 = new ThreadDemo(" Thread1");
    ThreadDemo t2 = new ThreadDemo(" Thread2");
    t1.setPriority(1);
    System.out.println("Thread Demo :" + t1.getPriority());

    t2.setPriority(6);
    System.out.println(" Thread DemoNew :" + t2.getPriority());
  }
}
