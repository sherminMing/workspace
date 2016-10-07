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
		System.out.println(nameString+"��������......");
	}
}
public class MySystem {
/*
 * 1.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
          ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
   2.currentTimeMillis() 
          �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
   3.exit(int status) 
          ��ֹ��ǰ�������е� Java �������
   4.gc() 
          ����������������
   5.getenv(String name) 
          ���ָ���Ļ�������ֵ��
   6.getProperties() 
          ȷ����ǰ��ϵͳ���ԡ�
 */
	public static void main(String[] args) {
		int[] a={10,12,11,45,56,77};
		int[] b={1,2,3,4,5,6,7,8,9,0};
		System.arraycopy(a, 0, b, 0, 3);
		System.out.println(Arrays.toString(b));
		System.out.println("ʱ��:"+System.currentTimeMillis());
		//System.gc();
		//System.exit(-1);
		for(int i=0;i<4;i++){
			new Person1("΢΢"+i);
			System.gc();
		}
		System.out.println("��������windir:"+System.getenv("windir"));
		Properties properties=System.getProperties();
		//properties.list(System.out);
		System.out.println("����ϵͳ:"+properties.getProperty("os.name"));
	}

}
