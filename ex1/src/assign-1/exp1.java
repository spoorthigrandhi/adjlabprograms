package assign-1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class exp1 {
	
	static void myMethod() throws IOException {
		ArrayList <String> hs = new ArrayList <String>();
		File file = new File("C:\Users\Spoorthi\OneDrive\Desktop\adj prog.txt");
		BufferedReader buff = new BufferedReader(new FileReader(file));
		
		String s;
		try {
			while ((s = buff.readLine()) != null) {
				s = s.replace(",","");
				String[] st = s.split(" ");
				for(String str : st) {
					hs.add(str);
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		TreeSet<String> t = new TreeSet<String>(hs);
		for(String p : t) {
			int a = 0;
			for(String d : hs) {
				if(p.equals(d)) {
					a++;
				}
			}
			System.out.print(p);
			System.out.print(" ");
			System.out.println(a);
		}
	}
public static void main(String[] args) throws Exception {
	myMethod();
}

}
