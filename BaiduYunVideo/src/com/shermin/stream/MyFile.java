package com.shermin.stream;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
  	File(File parent, String child) 
          ���� parent ����·������ child ·�����ַ�������һ���� File ʵ���� 
	File(String pathname) 
          ͨ��������·�����ַ���ת���ɳ���·����������һ���� File ʵ���� 
	File(String parent, String child) 
          ���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ���� 

 */
public class MyFile {

	public static void main(String[] args) throws IOException {
		File file=new File("F:\\kobe.txt");
		/*File parent=new File("F:/");
		File child=new File(parent,"kobe.txt");
		File newfile=new File("F:\\","kobe.txt");
		System.out.println("������"+parent.exists());
		System.out.println("������"+child.exists());
		System.out.println("������"+newfile.exists());
		System.out.println("�ָ�����"+File.separator);*/
		
		/*System.out.println("������"+file.exists());
		System.out.println("���ļ���"+file.isFile());
		System.out.println("���ļ�������"+file.isDirectory());
		System.out.println("�����ļ���"+file.isHidden());
		System.out.println("�ļ���:"+file.getName());
		System.out.println("����·��:"+file.getAbsolutePath());
		System.out.println("�ļ���С��"+file.length());
		System.out.println("��Ŀ¼:"+file.getParent());
		long date=file.lastModified();
		Date d=new Date(date);
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println("���һ�α��޸�:"+simpleDateFormat.format(d));
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
