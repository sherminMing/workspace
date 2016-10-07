package com.shermin.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable{
	public static final long serialVersionUID=10123456789001L;
	
	String userNameString;
	String passwordString;
	public User(String userString,String passString) {
		this.userNameString=userString;
		this.passwordString=passString;
	}
	public String toString() {
		return "用户名:"+this.userNameString+" 密码："+this.passwordString;
	}
}
public class ObjectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    // writeObj();
		readObj();
	}
	public static void writeObj() throws IOException {
		User user=new User("adminadmin", "123321");
		File file=new File("F:\\users.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file,true);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		//objectOutputStream.writeChars("\r\n");
		objectOutputStream.writeObject(user);
		objectOutputStream.close();
	}
	public static void readObj() throws IOException, ClassNotFoundException {
		File file=new File("F:\\users.txt");
	    FileInputStream fileInputStream=new FileInputStream(file);
	    ObjectInputStream  objectInputStream=new ObjectInputStream(fileInputStream);
	    User user=(User)objectInputStream.readObject();
	    System.out.println("对象信息   "+user);
	    objectInputStream.close();
		
	}
}
