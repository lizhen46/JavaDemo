package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流来完成对文件的复制操作
 * 思路：使用文件输入流来读取原文件，使用文件输出流向复制文件中写出
 * 循环顺序从原文见读取字节写入到复制文件中完成复制
 * 
 * 这里使用块读写形式复制 由于读写方式一样 参考RAF复制操作
 * @author soft01
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("video.avi");
		FileOutputStream fos = new FileOutputStream("video_cp.avi");
		int len = -1;
		byte[] bt = new byte[1024];
		
		while((len = fis.read(bt))!=-1) {		
		fos.write(bt,0,len);
		}
		System.out.println("复制完毕");
		fis.close();
		fos.close();
	}

}
