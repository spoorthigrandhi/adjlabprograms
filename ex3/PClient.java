//client implementation
import java.rmi.*;
import java.util.*;

public class PowerClient {
    public static void main(String args[]) throws Exception {
    	int x,n,y;
    	Scanner sc  = new Scanner(System.in);
    	System.out.println("The Equation : y = x ^ n");
    	System.out.print("Enter x(base) value : ");
    	x = sc.nextInt();
		System.out.print("Enter n(power) value : ");
    	n = sc.nextInt();
    	Power pw = (Power)Naming.lookup("rmi://localhost:1099/powerServer");

    	y = pw.pow(x,n);

    	System.out.println("y = " + y);
    }
}