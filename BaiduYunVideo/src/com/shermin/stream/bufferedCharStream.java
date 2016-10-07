package com.shermin.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
class LineBuffered extends BufferedReader{
	int count=1;
	public LineBuffered(Reader in) {
		super(in);
	}
	@Override
	public String readLine() throws IOException {
	String line=super.readLine();
	if(line==null){
		return null;
	}
	line=count+"　"+line;
	count++;
		return line;
	}
	
}
class HuaBuffered extends BufferedReader{
	public HuaBuffered(Reader in) {
		super(in);
	}
	@Override
	public String readLine() throws IOException {
	String line=super.readLine();
	if(line==null){
		return null;
	}
	line="[　"+line+"  ]";
		return line;
	}
	
}
public class bufferedCharStream {

	public static void main(String[] args) throws IOException {
		readtest1();
		//writeTest();
	}
	public static void readtest1() throws IOException{
		File file=new File("D:\\JavaProgram\\workspace\\BaiduYunVideo\\src\\com\\shermin\\stream\\bufferedCharStream.java");
		FileReader fileReader=new FileReader(file);
//		BufferedReader bufferedReader=new BufferedReader(fileReader);
		LineBuffered lineBuffered=new LineBuffered(fileReader);
		/*int content=bufferedReader.read();
		System.out.println((char)content);*/
		String line=null;
		while ((line=lineBuffered.readLine())!=null){			
			System.out.println(line);
		}
		fileReader.close();
	}
	public static void writeTest() throws IOException{
		File file=new File("F:\\shermin.txt");
		FileWriter fileWriter=new FileWriter(file,true);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		char[] buf=new char[1024];
		long date=System.currentTimeMillis();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date d=new Date(date);
		String data="\r\n这句话是这个时候写的"+simpleDateFormat.format(d);
		buf=data.toCharArray();
		bufferedWriter.newLine();
		bufferedWriter.write(buf);
		bufferedWriter.close();
	}
	
}
