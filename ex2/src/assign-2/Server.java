package ass2;


import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.ServerSocket; 
import java.net.Socket; 
import java.util.StringTokenizer; 
  
public class TCPserve
{ 
    public static void main(String args[]) throws IOException 
    { 
        ServerSocket ss = new ServerSocket(1899); 
        Socket s = ss.accept(); 
  
        DataInputStream dinp = new DataInputStream(s.getInputStream()); 
        DataOutputStream dout = new DataOutputStream(s.getOutputStream()); 
               
        while (true) 
        { 
        	
        	String input = dinp.readUTF();            
           
            System.out.println(input); 
            
             
            int result = 0; 
            	
            StringTokenizer st = new StringTokenizer(input); 
  
            int op1 = Integer.parseInt(st.nextToken()); 
            String opn = st.nextToken(); 
            int op2 = Integer.parseInt(st.nextToken()); 
  
            if (opn.equals("+")) 
            { 
                result = op1 + op2; 
                
            } 
  
            else if (opn.equals("-")) 
            { 
                result = op1 - op2; 
                
            } 
            else if (opn.equals("*")) 
            { 
                result = op1 * op2; 
            } 
            
            else
            { 
                result = op1 / op2; 
            } 
           
  
            dout.writeUTF(Integer.toString(result)); 
           
        } 
    } 
} 
