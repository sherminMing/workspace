package com.shermin.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class homeWorkProperties {

	public static void main(String[] args) throws IOException {
	File file=new File("F:\\count.properties");
	if(!file.exists()){
		file.createNewFile();		
	}
	Properties properties=new Properties();
	properties.load(new FileInputStream(file));
	int count=0;
	String valueString=properties.getProperty("count");
	if(valueString!=null){
		count=Integer.parseInt(valueString);
	}
	if(count>=3){
		System.out.println("���ý���.....�빺������......");
		System.exit(0);
	}
	count++;
	System.out.println("�� "+count+" ��");
	properties.setProperty("count", count+"");
	properties.store(new FileOutputStream(file), "runtime");
	System.out.println("QQ��������.......");
	}

	

}
