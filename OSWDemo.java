package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * java将流按照读写单位划分为字节流与字符流
 * 所有字节流都继承：InputStream和OutputStream
 * 但是所有字符流都继承：Reader 和 Writer
 * 
 * 字符流是以字符（char）为最小单位读写数据的，因此字符流
 * 仅适合读写文本数据
 * 字符就底层实际还是读写字节，只是字节与字符的转换由字符流自行完成
 * 
 * 转换流：
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * 常用的字符流实现类，在以字符流作为操作的流连接中
 * 起到非常重要的环节，但是通常不直接操作这套流
 * @author soft01
 *
 */
public class OSWDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("abc.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		
		osw.write("如果你乖给你买条gai～");
		osw.write("爱不爱你不用你去猜～");
		System.out.println("写出完毕！");
		osw.close();
	}

}
