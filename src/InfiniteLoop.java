public class InfiniteLoop {
  public static void main(String[] args) throws InterruptedException {
    while (true) {
      System.out.println("Hi from within loop");
      Thread.sleep(1000);
    }
  }
}
