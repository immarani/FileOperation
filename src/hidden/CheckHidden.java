package hidden;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckHidden {

	public static void main(String[] args) {
		//hidden file
		/*File f=new File("C:\\Users\\imimm\\Downloads\\Empty");
		boolean b=f.isHidden();
System.out.println(b);*/
		//path of the listfiles
		/*File f=new File("C:\\Users\\imimm");
		//File[] fl=f.listFiles();
		String[] fl=f.list();
		for(String x:fl) {
		System.out.println(x);
		}*/
	File f=new File("C:\\Users\\imimm\\eclipse-workspace\\FileOperation\\Sample\\flip.txt");
	
	try {
		//boolean b=f.createNewFile();
		//System.out.println(b);
		/*FileWriter f1=new FileWriter(f);
		f1.write("Welcome to java Session");
		f1.close();*/
		FileReader f2=new FileReader(f);
		char[] c=new char[27];
		f2.read(c);
		for(char x:c) {
			System.out.print(x);
		}
		
	
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	

	}
}
