//server implementation
import java.rmi.*;
import java.rmi.server.*;

public class Powerserver extends UnicastRemoteObject implements Power{

  public Powerserver() throws RemoteException{
    super();
  }
  public int pow(int a, int b) throws RemoteException{
    int y = (int)(Math.pow(a,b));
    return y;
  }

  public static void main(String args[]) throws Exception{
    Powerserver server = new Powerserver();
    System.out.println("RMI server is running..!!");
    Naming.rebind("powerServer",server);
  }

}