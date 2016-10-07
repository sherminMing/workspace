package com.shermin.test;

import java.util.Arrays;
import java.util.Properties;
class Person1{
	String nameString;
	public Person1(String name){
		this.nameString=name;
	}
	@Override
	protected void finalize() throws Throwable {
		//super.finalize();
		System.out.println(nameString+"被回收了......");
	}
}
public class MySystem {
/*
 * 1.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
          从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
   2.currentTimeMillis() 
          返回以毫秒为单位的当前时间。
   3.exit(int status) 
          终止当前正在运行的 Java 虚拟机。
   4.gc() 
          运行垃圾回收器。
   5.getenv(String name) 
          获得指定的环境变量值。
   6.getProperties() 
          确定当前的系统属性。
 */
	public static void main(String[] args) {
		int[] a={10,12,11,45,56,77};
		int[] b={1,2,3,4,5,6,7,8,9,0};
		System.arraycopy(a, 0, b, 0, 3);
		System.out.println(Arrays.toString(b));
		System.out.println("时间:"+System.currentTimeMillis());
		//System.gc();
		//System.exit(-1);
		for(int i=0;i<4;i++){
			new Person1("微微"+i);
			System.gc();
		}
		System.out.println("环境变量windir:"+System.getenv("windir"));
		Properties properties=System.getProperties();
		//properties.list(System.out);
		System.out.println("操作系统:"+properties.getProperty("os.name"));
	}

}
