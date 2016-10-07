package com.shermin.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.spi.RegisterableService;

public class LoginStream {
    static	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		System.out.println("Make a Choose: \n(A) Register (B)Login");
		Scanner scanner=new Scanner(System.in);
		String option=scanner.next();
		if("a".equalsIgnoreCase(option)){
			reg();
		}else if("b".equalsIgnoreCase(option)){
			login();
		}else{
			System.out.println("你的输入错误，请重新输入.......");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void reg() throws IOException{
		System.out.println("username:");
		String nameString=scanner.next();
		System.out.println("password:");
		String pass=scanner.next();
		File file=new File("F:\\users.txt");
		FileWriter fileWriter=new FileWriter(file,true);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		String infoString=nameString+" "+pass;
		bufferedWriter.write(infoString);
		bufferedWriter.newLine();
		bufferedWriter.close();
	}
	public static void login() throws IOException{
		System.out.println("username:");
		String nameString=scanner.next();
		System.out.println("password:");
		String pass=scanner.next();
		String infoString=nameString+" "+pass;
		File file=new File("F:\\users.txt");
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String line=null;
		boolean isLogin=false;
		while((line=bufferedReader.readLine())!=null){
			if(line.endsWith(infoString)){
				isLogin=true;
				break;
			}
		}
		bufferedReader.close();
		if(isLogin){
			System.out.println("welcome "+nameString+" login");
		}else{
			System.out.println("fail");
		}
		
	}
	
	
	

}
