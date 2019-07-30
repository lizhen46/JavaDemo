package file;

import java.io.File;
import java.io.IOException;

public class Demo03 {

	public static void main(String[] args) throws IOException {
		File file = new File("./demo.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("文件创建成功！");
		}else {
			System.out.println("文件已创建");
		}
	}

}
