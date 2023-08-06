public class InfiniteLoop {
  public static void main(String[] args) throws InterruptedException {
    while (true) {
      System.out.println("Hi from : "+System.getenv("MSG_SENDER"));
      Thread.sleep(1000);
    }
  }
}
