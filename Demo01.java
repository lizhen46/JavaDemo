package file;

import java.io.File;
import java.io.IOException;

public class Demo01 {
//File
	public static void main(String[] args) throws IOException{
		
		File file = new File("/home/soft01/demo");
		
		boolean b = file.mkdir();
		System.out.println(b);
		File file2 = new File("/home/soft01/demo/test.txt");
		b = file2.createNewFile();
		System.out.println(b);
		File dir = new File("/home/soft01/demo");
		File file3 = new File(dir,"12.txt");
		file3.createNewFile();
		
		System.out.println(file3.isDirectory());
		System.out.println(file3.isFile());
		
	}

}
