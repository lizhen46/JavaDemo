package file;

import java.io.File;

public class DeleteDirDemo {

	public static void main(String[] args) {
		//删除./demo/a/b/c        删除目录前提必须这是一个空目录  
		File file = new File("./demo/a/b/c");
		if(file.exists()) {
			file.delete();
			System.out.println("文件夹已删除！");
		}else {
			System.out.println("文件不存在！");
		}
	}

}
