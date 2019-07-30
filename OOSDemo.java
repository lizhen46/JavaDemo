package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * 对象流是一对高级流，在流连接中负责对java中任何对象进行读写（可以将对象与一组字节间转换）
 * 
 * 一个类若希望被对象流读写，那么这个类必须要实现接口  Serializable (可序列化)
 * @author soft01
 *
 */
public class OOSDemo {
		public static void main(String[] args) throws IOException {
			/*
			 *  将一个Person实例写入文件person.obj中
			 */
			String name = "张三";
			String gender = "男";
			int age = 20;
			String[] otherInfo = {"是一名医生","已婚","在XX医院任主任医生"};
			
			Person p = new Person(name, age, gender, otherInfo);
			System.out.println(p);
			
			FileOutputStream fos = new FileOutputStream("person.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			/*
			 * 对象输出流写对象的方法:
			 * void writeObject(Object obj)
			 * 将给定对象按照其结构转换为一组字节后写出
			 *  
			 * 当对象经过OOS写出时，其将该对象按照结构转换为一组字节
			 * 这个过程称为“对象序列化”			 * 
			 * 当序列化的这组字节再经过FOS写入到文件中（写入到磁盘做长久保存）
			 * 这个过程称为“数据持久化”
			 */
			oos.writeObject(p);
			System.out.println("写出完毕");
			oos.close();
			
			
		}
}
