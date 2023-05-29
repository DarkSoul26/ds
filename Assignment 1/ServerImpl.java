import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {
  public ServerImpl() throws RemoteException {
  };

  public double add(double a, double b) {
    return a + b;
  }
}
