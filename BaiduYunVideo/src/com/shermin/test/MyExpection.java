package com.shermin.test;

public class MyExpection {

	public static void main(String[] args) throws ArithmeticException,NullPointerException{
		/*Throwable throwable=new Throwable("Big Error");
		System.out.println("throwable.toString():  "+throwable.toString());
		System.out.println("Message:  "+throwable.getMessage());
	    throwable.printStackTrace();
		test();
		*/
		
		//java�����Ĭ�������ֻ�ܹ���64M�ڴ�
//		byte[] buf=new byte[1024*1024*1024];
     	try {
     		String aaaString=null;
     		int a=0;
			int c=5/a;
			if(a==0){
				throw new ArithmeticException();
			}else if(aaaString==null){
            throw new NullPointerException();
			}
		} catch (Throwable e) {
		
			e.printStackTrace();
		}
		System.out.println("OK");
	}
	public static void test(){
		Throwable throwable=new Throwable("");
		throwable.printStackTrace();
	}
}
