package com.shermin.test;

import java.util.Arrays;

public class Mystring {

	public static void main(String[] args) {
		String string=new String();
		byte[] buf={97,66,65};
		string=new String(buf);//ʹ���ֽ����ݹ����ַ���
		string=new String(buf,0,2);//ָ����ʼ���������ֵ�ͽ���ĸ���
		/*
		 * String(char[] value) ����һ���µ� String������ʾ��ǰ�ַ���������а������ַ����С�
		 */
		char[] arr={'S','H','D','B','Ŷ','ҹ'};
		int[] intarr={66,67,89,33,90,97};
		string=new String(arr);
		string=new String(arr,4,2);
		string=new String(intarr, 0, 5);
		string=new String("kobe678ko9");
		System.out.println(string+string.length());
		System.out.println("����ָ���������� charֵ��"+string.charAt(4));
		System.out.println("����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������"+string.indexOf("be0"));
		System.out.println("�����ڴ��ַ��������ұ߳��ֵ�ָ�����ַ�����������"+string.lastIndexOf("ko"));
		
		
		
		
		
		
		
		
		
		
		
		//�жϷ���
		String str="Demo.java";
		System.out.println("���Դ��ַ����Ƿ���ָ���ĺ�׺������"+str.endsWith("la"));
		System.out.println("�Ƿ�Ϊ��"+str.isEmpty());
		System.out.println("���ҽ������ַ������� char ֵ��ָ������ʱ���ŷ��� true��"+str.contains("de"));
		System.out.println("���� String ����һ�� String ���бȽϣ������Ǵ�Сд��"+"dEMO.Java".equalsIgnoreCase(str));
		
		
		
		
		
		
		//ת������
		//�����ַ���ת��Ϊһ���µ��ַ����顣
		String anString="jsp2.0��̬��ҳ�漰";
		//char[] cs=anString.toCharArray();
		//String ddStrings=Arrays.toString(anString);
		//System.out.println(cs);
		//��������
		String ipString="   www.bai   du.com.cn    ";
		System.out.println(anString.replace('j', '��'));
		System.out.println(anString.replace("jsp", ".net"));
		System.out.println(anString);
		String[] ipArrayStrings=ipString.split("\\.");
		System.out.println(Arrays.toString(ipArrayStrings));
		//System.out.println(ipArrayStrings.toString());
		System.out.println("����һ�����ַ��������Ǵ��ַ�����һ�����ַ�����"+ipString.substring(2,6));
		System.out.println("  �����ַ����ĸ���������ǰ���հ׺�β���հס�"+ipString.trim());
		System.out.println("********************************************");
		//StringBuffer
		StringBuffer sf=new StringBuffer();
		System.out.println("��ʼ��С�� "+sf.capacity());
		sf.append("java");
		sf.insert(3,"ЦЦ");
		/*sf.append(false);
		sf.append(3.14f);
		sf.append(1000l);
		sf.append(2.2);
		��ӵķ���
		*/
		/*
		 * ����ķ���
		 * sf.insert(2, "xiaoming");
		 */
		/*sf.delete(0, 2);
		sf.deleteCharAt(3);
		 * �޸�
		 */
		sf.replace(1, 4, "abc");
		sf.setCharAt(2, '��');
		System.out.println("���: "+sf.toString());
		//System.out.println(sf.capacity());
		
		
		
		
	}

}
