import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExample {

  //static ServerSocket variable
  private static ServerSocket server;
  //socket server port on which it will listen
  private static int port = 9876;
  private static String serverIP = "172.17.0.2";


  public static void main(String[] args) throws Exception {

    InetSocketAddress serverAddr = new InetSocketAddress(serverIP, port);
    server = new ServerSocket();
    server.bind(serverAddr);

    System.out.println("Started Socket server!!");


    //keep listens indefinitely until receives 'exit' call or program terminates
    while(true){
      Socket socket = server.accept();
      ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
      String message = (String) ois.readObject();
      System.out.println("Message Received: " + message);
      ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
      oos.writeObject("Hi Client "+message);

      ois.close();
      oos.close();
      socket.close();
      if(message.equalsIgnoreCase("exit")) break;
    }
    System.out.println("Shutting down Socket server!!");
    server.close();
  }
}
