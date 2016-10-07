package com.shermin.test;

import java.util.ArrayList;

import static java.util.Collections.sort;//静态导入
import static java.util.Collections.binarySearch;
import static java.lang.System.out;
enum Sex{
	man,woman;//枚举值
	//public static final Sex man=new Sex();
	String valueString="100";
	public void getValueString() {
		System.out.println(this.valueString);
		System.out.println(this.man);
	}
}
public class littleTest {

	public static void main(String[] args) {
  /*  ArrayList<Integer> arrayList=new ArrayList<Integer>();
    arrayList.add(172);
    arrayList.add(163);
    arrayList.add(189);
    arrayList.add(155);
    arrayList.add(134);
    sort(arrayList);*/
    /*System.out.println(arrayList);
    System.out.println(binarySearch(arrayList, 163));
    out.println();*/
 /*   for (Integer integer : arrayList) {
		System.out.println(integer);
	}
    int a[]={1,2,3,4,5,6,7};
    for (int i : a) {
		System.out.print(i+"  ");
	}*/
		
		//int[] arr={1,3,4,5,67,8};
	/*	add(1,2,3,4,5,4);
		add(1,2,3,4,5,4,555);
		add(8,2,3,4,5,4,550);
		add(0,1,10,100,1000,10000);
		add('a','9');*/
		
		/*String ht="1011";
		int hex=Integer.parseInt(ht,2);
		System.out.println(hex);*/
		/*Integer in;
		int t=10;
		in=t;//自动装箱
		System.out.println("The value of the local variable in is not used>:"+in);
		String urlString="(www.apk.com)";
		*/
		
		Sex sex=Sex.man;
		sex.valueString="femal";
		sex.getValueString();
		
		
		
		
		
		
		
		
	
		
		
	}
	public static void add(int... arr){
		System.out.println("长度："+arr.length);
		int result=0;
		for (int i : arr) {
		result+=i;	
		}
		System.out.println("result="+result);
	}

}
