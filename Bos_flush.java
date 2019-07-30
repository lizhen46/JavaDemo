package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流读写效率之所以高是因为数据在经过它时，一定会被转化为块读写
 * 
 * 缓冲输出流写出数据要注意缓冲区
 * @author soft01
 *
 */
public class Bos_flush {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "略略略";
		byte[] data = str.getBytes("utf-8");
		bos.write(data);
		/**
		 * void flush()
		 * 强制将缓冲流中缓冲区里已经缓存的数据一次性写出
		 * 频繁的调用flush会提高实际写出数据的次数
		 * 从而降低写出效率 但是可以保证数据写出的及时性
		 */
		//bos.flush();    //即时性，调用多次的话会降低效率，
		System.out.println("写出完毕");
		bos.close();      //自带flush 关闭的时候才会flush
	}

}
