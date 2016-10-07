package com.shermin.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

/*
 * F下把kobe.txt,shermin.txt合并成lakers.txt
 */
public class MySequenceStream {

	public static void main(String[] args) throws IOException {
		//merge();
		//cutFile();
		mergeFile();
	}
	public static void merge() throws IOException{
		File inFile1=new File("F:\\shermin.txt");
		File inFile2=new File("F:\\kobe.txt");
		File outFile=new File("F:\\lakers.txt");
		FileInputStream fileInputStream1=new FileInputStream(inFile1);
		FileInputStream fileInputStream2=new FileInputStream(inFile2);
		FileOutputStream fileOutputStream=new FileOutputStream(outFile);
		SequenceInputStream sequenceInputStream=new SequenceInputStream(fileInputStream1, fileInputStream2);
		byte[] buf=new byte[1024];
		int length=0;
		while ((length=sequenceInputStream.read(buf))!=-1) {
			fileOutputStream.write(buf, 0, length);
		}
		sequenceInputStream.close();
//		fileInputStream2.close();
//		fileInputStream1.close();
		fileOutputStream.close();
	}
	public static void cutFile() throws IOException{
		File file=new File("F:\\bg.mp3");
		File dirFile=new File("F:\\music");
		FileInputStream fileInputStream=new FileInputStream(file);
		byte[] buf=new byte[1024*512];
		int length=0;
		for(int i=0;(length=fileInputStream.read(buf))!=-1;i++){
			FileOutputStream fileOutputStream=new FileOutputStream(new File(dirFile,"part"+i+".mp3"));
			fileOutputStream.write(buf, 0, length);
			fileOutputStream.close();
		}
		fileInputStream.close();
		
	}
	public static void mergeFile() throws IOException{
		File dirFile=new File("F:\\music");
		File[] filesStrings=dirFile.listFiles();
		Vector<FileInputStream> vector=new Vector<FileInputStream>();
		for (File file : filesStrings) {
			if(file.getName().endsWith(".mp3")){
				vector.add(new FileInputStream(file));
			}
		}
		SequenceInputStream sequenceInputStream=new SequenceInputStream(vector.elements());
		FileOutputStream fileOutputStream=new FileOutputStream("F:\\merge.mp3");
		byte[] buf=new byte[1024];
		int length=0;
		while ((length=sequenceInputStream.read(buf))!=-1) {
			fileOutputStream.write(buf, 0, length);
		}
		fileOutputStream.close();
		sequenceInputStream.close();
	}
	
}
