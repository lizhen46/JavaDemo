package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流：
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 
 * 缓冲流是一对高级流,在流连接中起到加速读写效率的作用
 * @author soft01
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("video.avi");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("video_cp1.avi");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int d = -1;
		long start = System.currentTimeMillis();
		while((d=bis.read())!=-1) {
			bos.write(d);
		}
		long end = System.currentTimeMillis();

		System.out.println(end-start);
		bis.close();
		bos.close();
	}

}
