import java.rmi.*;

public interface ServerIntf extends Remote {
   
   public double add(double a, double b) throws RemoteException;

}
