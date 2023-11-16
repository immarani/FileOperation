package fileSection;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filetext {
	public static void main (String[]args) {
	//File f=new File("C:\\Users\\imimm\\eclipse-workspace\\FileOperation\\Sample\\ClassA\\ClassB");
	//boolean b=f.mkdirs();//to create multiple folders
	//mk.dir() //to create one folder
	//isdirectory//is that path is located
	/*ishidden() //it identity the given path is hidden or not
		File f=new File("C:\\Users\\imimm\\Downloads\\Empty");*/
//delete()
	/*File f=new File("C:\\Users\\imimm\\OneDrive\\Documents");
	File[] listfiles=f.listFiles();
	for(File x:listfiles) {
	System.out.println(x);
	}*/
		/*String[] s=f.list();
		for(String x:s) {
			System.out.println(x);
			}*/
		File f=new File("C:\\Users\\imimm\\eclipse-workspace\\FileOperation\\Sample\\amaz.txt");
		try {
			boolean b=f.createNewFile();
			System.out.println(b);
			FileReader file=new FileReader(f);
			char[] c=new char[10];
			file.read(c);
			for(char x:c) {
				System.out.print(x);
			}
			
			//FileWriter filewriter=new FileWriter(f);
		//	filewriter.write("Hello java");
			//filewriter.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
}
	
}