package com.shermin.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.shermin.test.NewMap;

public class CharStream {

	public static void main(String[] args) throws IOException {
		//readtest1();
		readtest2();
	/*	File inFile=new File("F:\\vcredist.bmp");
		File outFile=new File("E:\\dist.bmp");
		FileReader fileReader=new FileReader(inFile);
		FileWriter fileWriter=new FileWriter(outFile);
		char[] buf=new char[1024];
		int length=0;
		while ((length=fileReader.read(buf))!=-1) {
			fileWriter.write(buf,0,length);
		}
		fileWriter.close();
		fileReader.close();
		System.out.println("Ok");*/
	}
	public static void readtest1() throws IOException{
		File file=new File("F:\\shermin.txt");
		FileReader fileReader=new FileReader(file);
		int content=0;
		while((content=fileReader.read())!=-1){
			System.out.print((char)content);
		}
		fileReader.close();
	}
	public static void readtest2() throws IOException{
		System.out.println("into....");
		//File file=new File("F:\\shermin.txt");
		File file=new File("E:\\123.bak");
		FileReader fileReader=new FileReader(file);
		int length=0;
		char[] buf=new char[1024];
		System.out.println("begin while...");
		while((length=fileReader.read(buf))!=-1){
			System.out.print(new String(buf,0,length));
		}
		fileReader.close();
	}
	
	
	

	
}
