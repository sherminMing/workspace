package com.shermin.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class MyProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//createProperties();
		readProperties();
	}
	public static void createProperties() throws FileNotFoundException, IOException{
		Properties properties=new Properties();
		properties.setProperty("����", "111");
		properties.setProperty("����", "357");
		properties.setProperty("Ѷ��", "211");
		Set<Entry<Object, Object>> entries=properties.entrySet();
		/*for (Entry<Object, Object> entry : entries) {
			System.out.println("���� "+entry.getKey()+"   ֵ��"+entry.getValue());
		}*/
//		properties.store(new FileOutputStream("F:\\persons.properties",true),"person");
		properties.store(new FileWriter("F:\\persons.properties"), "HAHE");
	}
	public static void readProperties() throws FileNotFoundException, IOException{
		Properties properties=new Properties();
		Set<Entry<Object, Object>> entries=properties.entrySet();
		properties.load(new FileReader("F:\\persons.properties"));
		for (Entry<Object, Object> entry : entries) {
		System.out.println("���� "+entry.getKey()+"   ֵ��"+entry.getValue());
	}
		properties.setProperty("����", "007");
		properties.store(new FileWriter("F:\\persons.properties"), "HeHE");
		
		
	}
}
