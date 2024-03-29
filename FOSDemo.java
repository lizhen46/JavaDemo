package io;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * JAVA IO 标准的输入与输出
 * java以统一的标准的读写形式定义了一套API，成为“流”
 * 使用流可以读写任意设备（网络，文件，键盘，控制台）
 * java将流按照功能以方向的形式分为两类，
 * 输入流：input，是外界到我们写的程序的方向，使用输入流用于从外界获取数据，是读操作
 * 输出流：output，用于将数据发送至外界，是写操作
 * 
 * java 将流划分为节点流与处理流
 * 节点流：又成为“低级流”，是真实链接程序与数据源的“管道”，负责实际搬运数据的流
 * 			读写一定是建立在低级流基础上进行的
 * 处理流：又称“高级流”，高级流不能独立存在，必连接在其他流上，目的是当数据流经当前高级流时
 * 				对数据作某些加工处理，简化我们对数据的该操作
 * 串连一组高级流并最终连接在低级流上，在读写操作的过程中对数据进行一系列流水线式的加工处理，这种读写操作称为“流的连接”
 * 流连接也是IO的精髓所在
 * 
 * 文件流:
 * 
 * 文件流是以对低级流，作用是读写文件数据，
 * 在功能上它们与RandomAccessFile一致 但是RAF是基于指针的读写
 * 特点是可以对文件任意文件读或写
 * 并且能做到对文件数据编辑操作，读写灵活
 * 
 * 文件流是基于java IO 的流式读写，而流式读写是一种顺序读写形式
 * 只能顺序向后读或写，不能回退，但是基于流连接，串联高级流可以将
 * 复杂数据读写操作简单化.
 * @author soft01
 *
 */
public class FOSDemo {

	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		/**
		 *  对fos.txt文件写操作
		 *  
		 *  构造方法:
		 *  FileOutputStream(String path)
		 *  FileOutputStream(File file)
		 *  以上两种创建方式创建的文件输出流是覆盖操作写操作，
		 *  即：若指定的文件已经存在，会先将该文件数据删除
		 *        然后通过当前流写出的内容做为该文件数据保存
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true); // true 指在末尾追加数据 做不到在中间插入修改
		
		String str = "呵呵呵";
		
		fos.write(str.getBytes("utf-8"));
		str = "你就是个弟弟阿   " ;
		fos.write(str.getBytes("utf-8"));
		System.out.println("写出完毕");	
		fos.close();
	}

}
