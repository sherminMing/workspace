package com.shermin.test;

import java.util.Arrays;

public class Mystring {

	public static void main(String[] args) {
		String string=new String();
		byte[] buf={97,66,65};
		string=new String(buf);//使用字节数据构建字符串
		string=new String(buf,0,2);//指定开始解码的索引值和解码的个数
		/*
		 * String(char[] value) 分配一个新的 String，它表示当前字符数组参数中包含的字符序列。
		 */
		char[] arr={'S','H','D','B','哦','夜'};
		int[] intarr={66,67,89,33,90,97};
		string=new String(arr);
		string=new String(arr,4,2);
		string=new String(intarr, 0, 5);
		string=new String("kobe678ko9");
		System.out.println(string+string.length());
		System.out.println("返回指定索引处的 char值。"+string.charAt(4));
		System.out.println("返回指定字符在此字符串中第一次出现处的索引。"+string.indexOf("be0"));
		System.out.println("返回在此字符串中最右边出现的指定子字符串的索引。"+string.lastIndexOf("ko"));
		
		
		
		
		
		
		
		
		
		
		
		//判断方法
		String str="Demo.java";
		System.out.println("测试此字符串是否以指定的后缀结束。"+str.endsWith("la"));
		System.out.println("是否为空"+str.isEmpty());
		System.out.println("当且仅当此字符串包含 char 值的指定序列时，才返回 true。"+str.contains("de"));
		System.out.println("将此 String 与另一个 String 进行比较，不考虑大小写。"+"dEMO.Java".equalsIgnoreCase(str));
		
		
		
		
		
		
		//转换方法
		//将此字符串转换为一个新的字符数组。
		String anString="jsp2.0动态网页涉及";
		//char[] cs=anString.toCharArray();
		//String ddStrings=Arrays.toString(anString);
		//System.out.println(cs);
		//其他方法
		String ipString="   www.bai   du.com.cn    ";
		System.out.println(anString.replace('j', '李'));
		System.out.println(anString.replace("jsp", ".net"));
		System.out.println(anString);
		String[] ipArrayStrings=ipString.split("\\.");
		System.out.println(Arrays.toString(ipArrayStrings));
		//System.out.println(ipArrayStrings.toString());
		System.out.println("返回一个新字符串，它是此字符串的一个子字符串。"+ipString.substring(2,6));
		System.out.println("  返回字符串的副本，忽略前导空白和尾部空白。"+ipString.trim());
		System.out.println("********************************************");
		//StringBuffer
		StringBuffer sf=new StringBuffer();
		System.out.println("初始大小： "+sf.capacity());
		sf.append("java");
		sf.insert(3,"笑笑");
		/*sf.append(false);
		sf.append(3.14f);
		sf.append(1000l);
		sf.append(2.2);
		添加的方法
		*/
		/*
		 * 插入的方法
		 * sf.insert(2, "xiaoming");
		 */
		/*sf.delete(0, 2);
		sf.deleteCharAt(3);
		 * 修改
		 */
		sf.replace(1, 4, "abc");
		sf.setCharAt(2, '夏');
		System.out.println("输出: "+sf.toString());
		//System.out.println(sf.capacity());
		
		
		
		
	}

}
