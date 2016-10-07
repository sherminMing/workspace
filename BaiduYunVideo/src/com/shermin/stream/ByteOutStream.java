package com.shermin.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutStream {

	public static void main(String[] args) throws IOException {
//		writeTest1();
//		writeTest2();
//		writeTest3();
		long startTime=System.currentTimeMillis();
		copyImage();
		long endTime=System.currentTimeMillis();
		System.out.println("Time="+(endTime-startTime));
		System.out.println("success......");
	}
	public static void writeTest1() throws IOException{
		File file=new File("F:\\shermin.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		fileOutputStream.write('s');
		fileOutputStream.close();
	}
	public static void writeTest2() throws IOException{
		File file=new File("F:\\shermin.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file,true);
		String data="hello world hello china \r\n";
		fileOutputStream.write(data.getBytes());
		fileOutputStream.close();	
	}
	public static void writeTest3() throws IOException{
		File file=new File("F:\\shermin.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file,true);
		String data="www.baidu.com \r\n";
		byte[] buf=data.getBytes();
		fileOutputStream.write(buf,0,buf.length);
		fileOutputStream.close();	
	}
	public static void copyImage() throws IOException{
		FileInputStream fileInputStream=null;
		FileOutputStream fileOutputStream=null;
		try {
			/*File sourceImage=new File("F:\\bryant.jpg");
			File dstImageFile=new File("H:\\bryant.jpg");*/
			File sourceImage=new File("F:\\kobe.txt");
			File dstImageFile=new File("H:\\kobe.txt");
			fileInputStream=new FileInputStream(sourceImage);
			fileOutputStream=new FileOutputStream(dstImageFile);
			byte[] buf=new byte[1024];
			int length=0;
			while((length=fileInputStream.read(buf))!=-1){
				fileOutputStream.write(buf,0,length);
			}
		}catch (IOException e) {
			System.out.println("读取文件出错了");
			throw new RuntimeException(e);
		}finally{
		try{
			if(fileOutputStream!=null){
				fileOutputStream.close();
				System.out.println("关闭资源成功....");
			}
			if(fileInputStream!=null){
				fileInputStream.close();
				System.out.println("关闭资源成功....");
			}
			//System.out.println("关闭资源成功....");
		}catch(IOException e){
			System.out.println("关闭文件失败.....");
			throw new RuntimeException(e);
			
		}
		}
	}

}
