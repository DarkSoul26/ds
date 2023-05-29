import java.rmi.*;
import java.net.*;

public class Server {
   public static void main(String args[]) {
      try {
         ServerImpl skelton = new ServerImpl();
         Naming.rebind("AddServer", skelton);
      } catch (Exception e) {
         System.out.println("hhb");
      }
   }
}
