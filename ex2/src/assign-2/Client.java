package assign-2;

import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.InetAddress; 
import java.net.Socket; 
import java.util.Scanner; 
  
public class Client
{ 
    public static void main(String[] args) throws IOException 
    { 
        InetAddress ip = InetAddress.getLocalHost(); 
        int port = 1899; 
        Scanner sc = new Scanner(System.in); 
  
        Socket s = new Socket(ip, port); 
  
        DataInputStream dinp = new DataInputStream(s.getInputStream()); 
        DataOutputStream dout = new DataOutputStream(s.getOutputStream()); 
  
        while (true) 
        {
            System.out.print("Enter the String Operation: "); 
  
            String inp = sc.nextLine(); 
              

            dout.writeUTF(inp); 
  
            String result = dinp.readUTF(); 
            System.out.println("Result = " + result); 
            
            
        } 
    } 
} 

	