package com.shermin.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		//readtest1();
		//readtest2();
		//readtest3();
		
		readtest4();
	}
	public static void readtest1() throws IOException{
		File file=new File("F:\\kobe.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		int content=fileInputStream.read();
		System.out.println("We get :"+(char)content);
		fileInputStream.close();
	}
	public static void readtest2() throws IOException{
		File file=new File("F:\\kobe.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		int content=0;
		while ((content=fileInputStream.read())!=-1) {
			System.out.print((char)content);			
		}
		fileInputStream.close();
	}
	public static void readtest3() throws IOException{
		File file=new File("F:\\kobe.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		byte[] buf=new byte[1024];//缓存数组
		int length=fileInputStream.read(buf);
		System.out.println("length="+length);
		String contentString=new String(buf,0,length);
		System.out.println(contentString);
		fileInputStream.close();
	}
	public static void readtest4() throws IOException{
		long startTime=System.currentTimeMillis();
		File file=new File("F:\\kobe.txt");
		//File file=new File("E:\\123.bak");
		FileInputStream fileInputStream=new FileInputStream(file);
		//建立缓冲数组配合循环读取文件的数据
		int length=0;
		
		byte[] buf=new byte[1024];
		while((length=fileInputStream.read(buf))!=-1){
			System.out.println(new String(buf,0,length));
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Time="+(endTime-startTime));
	}
	
	           
	
	
	
	
	
	
	
}
