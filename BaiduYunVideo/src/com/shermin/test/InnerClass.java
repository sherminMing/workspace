package com.shermin.test;

import java.util.Date;

//class Wai{
//	int x=100;
//	public void print(){
//		int i=10;
//		class Nei{
//			public void say(){
//				System.out.println("�ڲ����say().......");
//			}
//			public void special(){
//				System.out.println("�ֲ��ڲ������ɫ����.......");
//			}
//		}
//		Nei nei=new Nei();
//		nei.special();
//		nei.say();
//	}
//	public void say(){
//		System.out.println("�ⲿ���say().......");
//	}
//}
class NoIpException extends Exception{
	public NoIpException(String message){
		super(message);
	}
}
public class InnerClass {

	public static void main(String[] args) throws NoIpException{
//		String ipString="192.168.1.112";
//		ipString=null;
//		feiQ(ipString);
//		try{
//		feiQ(ipString);
//		}catch(NoIpException e){
//			e.printStackTrace();
//			System.out.println("��������.......");
//		}
//		long now=System.currentTimeMillis();
//		Date d=new Date(now);
//		System.out.println("d="+d);
//		div(4,0);
		int arr[]={10,2,22,11,10,2,10};
		System.out.println(InnerClass.clearRepeat(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static int[] clearRepeat(int arr[]){
		int count=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j])
				{
				count++;
				break;
				}
			}
		}
		int newLength=arr.length-count;
		int[] newArr=new int[newLength];
		int index=0;
		for (int j = 0; j < arr.length; j++) {
			int temp=arr[j];
			boolean flag=false;
			for(int t=0;t<newArr.length;t++){
				
				if(temp==newArr[t])
					{
					flag=true;
					break;
					}
			}
			if(flag==false){
				newArr[index++]=temp;
			}
		}
		return newArr;
	}
	public static void feiQ(String ip) throws NoIpException {
		if(ip==null){
		//	System.out.println("ִ������");
			throw new NoIpException("û�в�����....");
		}
		System.out.println("OK...............");
	}
	public static void div(int a,int b){
        try{
        	if(b==0){
        		System.out.println("return.......");
        		return;
        	}
		int c=a/b;
		System.out.println("c="+c);
        }catch(Exception e){
        	e.printStackTrace();
        	System.out.println("by zero....");
        	//throw e;
        }finally{
        	System.out.println("finally........");
        }
	}

}
