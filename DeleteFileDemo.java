package file;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		//删除当前目录下的demo.txt
		File file = new File("./demo.txt");
		if(file.exists()) { //判断文件是否存在
			file.delete();
			System.out.println("文件已删除");
		}else {
			System.out.println("文件不存在");
		}
	}

}
