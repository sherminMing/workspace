package com.shermin.test;

import java.io.IOException;

/*
 * 1.getRuntime() 
          �����뵱ǰ Java Ӧ�ó�����ص�����ʱ����
   2.exec(String command) 
          �ڵ����Ľ�����ִ��ָ�����ַ�������
   3.freeMemory() 
          ���� Java ������еĿ����ڴ�����
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
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
		*/
	System.out.println("ʣ���ڴ�:"+runtime.freeMemory());
	System.out.println("��ͼ����ڴ�:"+runtime.maxMemory());
	System.out.println("�����ڴ�:"+runtime.totalMemory());
	}

}
