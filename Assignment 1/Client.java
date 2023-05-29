import java.rmi.*;

public class Client {

  public static void main(String args[]) {
    try {
      String url = "rmi://" + args[0] + "/AddServer";
      ServerIntf stub = (ServerIntf) Naming.lookup(url);
      System.out.println(stub.add(2, 3));
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
