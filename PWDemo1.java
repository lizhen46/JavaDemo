package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符流
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 块写文本数据，加快写出效率
 * 
 * 具有自动行刷新的缓冲字符输出流：
 * java.io.PrintWriter
 * @author soft01
 *
 */
public class PWDemo1 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/**
		 * 往 pw.txt文件中写数据
		 * PW提供了直接对文件写操作的构造方法：
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 */
		PrintWriter pw = new  PrintWriter("pw.txt","utf-8");
	
		pw.println("爱我的话你都说。");
		pw.println("爱我的事你不做～");
		pw.print("若不是你突然闯进我生活~");
		pw.println("我怎会把死守的寂寞，放任了～");
		System.out.println("写出完毕");
		pw.close();
	}

}
