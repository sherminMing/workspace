package com.shermin.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteBufferedInputStream {

	public static void main(String[] args) throws IOException {
//		readtest();
		writetest();
	}
	public static void readtest() throws IOException{
		File file=new File("F:\\shermin.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
		int content=0;
		while((content=bufferedInputStream.read())!=-1){
			System.out.print((char)content);
		}
//		bufferedInputStream.close();
		fileInputStream.close();
	}
	public static void writetest() throws IOException{
		File file=new File("F:\\shermin.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file,true);
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
		String data="Mamba Out";
	    byte[] buf=data.getBytes();
		bufferedOutputStream.write(buf,0,buf.length);
		bufferedOutputStream.flush();
		fileOutputStream.close();
	}

}
