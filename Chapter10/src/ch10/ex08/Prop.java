package ch10.ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		// store data in Properties Object
		prop.put("id", "admin");
		prop.put("pwd", "1234");
		prop.put("name", "gil-dong");

		// ready main stream
		String path = "C:/STUDY/temp/Object.dat";
		FileOutputStream fos = new FileOutputStream(path);
		
		// store
		prop.store(fos, "simple comment");
		
		// return sources
		fos.close();
	}
}
