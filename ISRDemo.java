package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用转换流读取文本数据
 * @author soft01
 *
 */
public class ISRDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("abc.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		
		int d ;
		while((d=isr.read())!=-1)
		{
		System.out.print((char)d);
		}
		isr.close();
		
		
	}

}
