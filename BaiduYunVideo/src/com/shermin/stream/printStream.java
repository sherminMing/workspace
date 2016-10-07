package com.shermin.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class printStream {

	public static void main(String[] args) throws IOException {
//		FileOutputStream fileOutputStream=new FileOutputStream("F:\\shermin.txt");
		PrintStream printStream=new PrintStream("F:\\shermin.txt");
		printStream.print(100);
		printStream.println();
		printStream.print(5.5f);
		printStream.println();
		printStream.println('A');
		printStream.println(true);
		
		System.setOut(printStream);
		System.out.println("hello word");
		
	}

}
