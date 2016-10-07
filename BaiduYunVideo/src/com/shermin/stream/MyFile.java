package com.shermin.stream;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
  	File(File parent, String child) 
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。 
	File(String pathname) 
          通过将给定路径名字符串转换成抽象路径名来创建一个新 File 实例。 
	File(String parent, String child) 
          根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。 

 */
public class MyFile {

	public static void main(String[] args) throws IOException {
		File file=new File("F:\\kobe.txt");
		/*File parent=new File("F:/");
		File child=new File(parent,"kobe.txt");
		File newfile=new File("F:\\","kobe.txt");
		System.out.println("存在吗？"+parent.exists());
		System.out.println("存在吗？"+child.exists());
		System.out.println("存在吗？"+newfile.exists());
		System.out.println("分隔符："+File.separator);*/
		
		/*System.out.println("存在吗？"+file.exists());
		System.out.println("是文件吗？"+file.isFile());
		System.out.println("是文件夹吗吗？"+file.isDirectory());
		System.out.println("隐藏文件吗？"+file.isHidden());
		System.out.println("文件名:"+file.getName());
		System.out.println("绝对路径:"+file.getAbsolutePath());
		System.out.println("文件大小："+file.length());
		System.out.println("父目录:"+file.getParent());
		long date=file.lastModified();
		Date d=new Date(date);
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println("最后一次被修改:"+simpleDateFormat.format(d));
		System.out.println("***************************************************");
		File[] roots=File.listRoots();
		for (File file2 : roots) {
			System.out.println(file2);
		}
		File file2=new File("F:\\web2\\www");
		String[] files=file2.list();
		for (String string : files) {
			System.out.println(string);
		}*/
		
		File dir=new File("D:\\JavaProgram\\workspace\\BaiduYunVideo\\src\\com\\shermin\\test");
		listJava(dir);
		
		
		
	}
	public static void listJava(File dir){
		File[] files=dir.listFiles();
		for (File file : files) {
			String filenameString=file.getName();
			if(filenameString.endsWith(".java")&&file.isFile()){
				System.out.println(filenameString);
			}
		}
	}

}
