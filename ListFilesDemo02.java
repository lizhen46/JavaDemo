package file;

import java.io.File;
import java.io.FileFilter;

//获取一个目录中满足指定条件的子项
public class ListFilesDemo02 {

	public static void main(String[] args) {
		File dir = new File(".");
		FileFilter filter = new FileFilter() { //重写过滤器方法 当参数file符合过滤规则
			public boolean accept(File file) {   //过滤器
				String name = file.getName();
				System.out.println("正在过滤:"+name);
				return name.startsWith(".");
			}
		};
		File[] subs = dir.listFiles(filter);
		System.out.println(subs.length);
		for (int i = 0; i < subs.length; i++) {
			File sub = subs[i];
			System.out.println(sub.getName());
		}
	}

}
