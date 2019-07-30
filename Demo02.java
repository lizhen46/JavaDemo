package file;

import java.io.File;

public class Demo02 {

	public static void main(String[] args) {
		// File API 可以创建“系列文件夹”;
		// file.mkdirs();
		File file = new File("./demo/a/b/c");
		boolean b=file.mkdirs();
		System.out.println(b);
		
	}

}
