package com.shermin.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * . 任何字符（与行结束符可能匹配也可能不匹配） 
	\d 数字：[0-9] 
	\D 非数字： [^0-9] 
	\s 空白字符：[ \t\n\x0B\f\r] 
	\S 非空白字符：[^\s] 
	\w 单词字符：[a-zA-Z_0-9] 
	\W 非单词字符：[^\w] 
	
	X?? X，一次或一次也没有 
	X*? X，零次或多次 
	X+? X，一次或多次 
	X{n}? X，恰好 n 次 
	X{n,}? X，至少 n 次 
	X{n,m}? X，至少 n 次，但是不超过 m 次 
	
	字符类 
	[abc] a、b 或 c（简单类） 
	[^abc] 任何字符，除了 a、b 或 c（否定） 
	[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
	
	字符串：
	匹配machers();
	切割spilt();
	replaceAll
	public String replaceAll(String regex,String replacement)
	使用给定的 replacement 字符串替换此字符串匹配给定的正则表达式的每个子字符串
	
	
	正则对象Pattern
	匹配器对象Matter
	 Pattern p = Pattern.compile("a*b");
     Matcher m = p.matcher("aaaaab");
     boolean b = m.matches();
           匹配器用到的方法
	1.find()   通知匹配器匹配子串，查找符合规定的字符串，查到返回true,否则false
	2.group()  获取符合的子串
	单词边界匹配器
	\b:代表了单词的开始或结束部分，不匹配任何字符
	使用group方法时，先调用find方法让匹配器去查找符合的字符串，再用group获取
 */
public class MyReguation {

	public static void main(String[] args) {
		/*machersPhone("13855430592");
		machersPhone("1108010236");
		machersPhone("15858198897");
		machersPhone("110");
		machersPhone("120");*/
		/*machersTel("0558-8069834");
		machersTel("0558-8069662");
		machersTel("0571-87376103");
		machersTel("021-8088732");*/
//		testPolit();
//		replaceTest1();
//		replaceTest2();
		String content="da jia de jia qi jie shu le kai xin ma shermin";
		Pattern pattern=Pattern.compile("\\b[a-zA-Z]{3}\\b");
		Matcher matter=pattern.matcher(content);
		while (matter.find()) {
			System.out.println(matter.group());
		}
		
		
	}
	public static void machersPhone(String phoneNum){
		if(phoneNum.matches("1[34578]\\d{9}")){
			System.out.println("Ok......");
		}else{
			System.out.println("Fail......");
		}
	}
	public static void machersTel(String tel){
		if(tel.matches("0\\d{2,3}-[1-9]\\d{6,7}")){
			System.out.println("Ok......");
		}else{
			System.out.println("Fail......");
		}
	}
	public static void testPolit(){
		//根据重叠词进行切割
		String string="大家家家家家家明天玩玩玩得得得要开开的心心啊";
//		大 ,,明天玩玩玩得得得要开开的心心啊
		String[] attr=string.split("(.)\\1+");
		System.out.println(Arrays.toString(attr));
	}
	public static void replaceTest1(){
		String string="请联系13855430592 请联系13855430592 请联系13855430592 请联系13855430592";
		String reg="1[34578]\\d{9}";
		string=string.replaceAll(reg, "****");
		System.out.println(string);
	}
	public static void replaceTest2(){
		String str="我我我要要好好的学学习习";
		str=str.replaceAll("(.)\\1+","$1");
		System.out.println(str);
	}

}
