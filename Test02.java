package io;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 完成简易记事本工具
 * 使用PrintWriter并自行使用流连接形式创建
 * 
 * 首先输入一个文件名，然后对该文件操作，之后美输入的
 * 一行字符串按行写入到该文件中，当输入exit退出
 * @author soft01
 *
 */
public class Test02 {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException{
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入文件名");
		String name = scan.nextLine();
		/*
		 * 当创建PrintWriter时，构造方法第一个参数为一个流时，就支持再传入一个boolean
		 * 的参数，当这个参数为true时，就开启了自动行刷新功能
		 * 这时调用该pw的println方法时写出一字符串后会flush
		 */
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream(name),"utf-8")),true);
				
			 
		System.out.println("请输入内容:");
		
		while(true) {
		String str = scan.next();	
		if(("exit".equals(str.toLowerCase()))) {
			System.out.println("退出");
			break;			
		}
		pw.println(str);
		
		}
		scan.close();
		pw.close();
		
		
			
	}			
}


