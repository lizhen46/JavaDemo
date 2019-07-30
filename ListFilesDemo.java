package file;

import java.io.File;
import java.io.IOException;

public class ListFilesDemo {

	public static void main(String[] args) throws IOException {
		// 获取当前目录中的所有内容
		File dir = new File(".");
		//是目录                                      
		if(dir.isDirectory()) {
			File[] sub = dir.listFiles(); //获取到一个目录中的所有子目录
			System.out.println(sub.length);
			for (int i = 0; i < sub.length; i++) {
				File sub1 = sub[i];
//				System.out.println(sub1.getName());
				System.out.println(sub1.getCanonicalPath());
				
			}
		}
	}

}
