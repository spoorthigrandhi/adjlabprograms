//interface implementation
import java.rmi.*;
public interface Power extends Remote
{
  //remote methods declaration
public int pow(int a, int b) throws RemoteException;
}