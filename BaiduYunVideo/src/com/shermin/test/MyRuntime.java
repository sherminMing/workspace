package com.shermin.test;

import java.io.IOException;

/*
 * 1.getRuntime() 
          返回与当前 Java 应用程序相关的运行时对象。
   2.exec(String command) 
          在单独的进程中执行指定的字符串命令
   3.freeMemory() 
          返回 Java 虚拟机中的空闲内存量。
 */
public class MyRuntime {

	public static void main(String[] args) {
	Runtime runtime=Runtime.getRuntime();
	/*
	try {
		Process process=runtime.exec("notepad.exe");
		Thread.sleep(2000);
		process.destroy();
	} catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
		*/
	System.out.println("剩余内存:"+runtime.freeMemory());
	System.out.println("试图最大内存:"+runtime.maxMemory());
	System.out.println("最大的内存:"+runtime.totalMemory());
	}

}
