package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 从文件中读取字节
 * @author soft01
 *
 */
public class FISDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 
		 */
		
		FileInputStream fis = new FileInputStream("fos.txt");
		
		
		
		byte[] data = new byte[1000];
		int len = fis.read(data);
		System.out.println("实际读到的字节:"+len);
		String str = new String(data,0,len,"utf-8");
		System.out.println(str);
		fis.close();
	}

}
