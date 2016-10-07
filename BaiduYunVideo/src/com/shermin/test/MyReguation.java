package com.shermin.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * . �κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩 
	\d ���֣�[0-9] 
	\D �����֣� [^0-9] 
	\s �հ��ַ���[ \t\n\x0B\f\r] 
	\S �ǿհ��ַ���[^\s] 
	\w �����ַ���[a-zA-Z_0-9] 
	\W �ǵ����ַ���[^\w] 
	
	X?? X��һ�λ�һ��Ҳû�� 
	X*? X����λ��� 
	X+? X��һ�λ��� 
	X{n}? X��ǡ�� n �� 
	X{n,}? X������ n �� 
	X{n,m}? X������ n �Σ����ǲ����� m �� 
	
	�ַ��� 
	[abc] a��b �� c�����ࣩ 
	[^abc] �κ��ַ������� a��b �� c���񶨣� 
	[a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
	
	�ַ�����
	ƥ��machers();
	�и�spilt();
	replaceAll
	public String replaceAll(String regex,String replacement)
	ʹ�ø����� replacement �ַ����滻���ַ���ƥ�������������ʽ��ÿ�����ַ���
	
	
	�������Pattern
	ƥ��������Matter
	 Pattern p = Pattern.compile("a*b");
     Matcher m = p.matcher("aaaaab");
     boolean b = m.matches();
           ƥ�����õ��ķ���
	1.find()   ֪ͨƥ����ƥ���Ӵ������ҷ��Ϲ涨���ַ������鵽����true,����false
	2.group()  ��ȡ���ϵ��Ӵ�
	���ʱ߽�ƥ����
	\b:�����˵��ʵĿ�ʼ��������֣���ƥ���κ��ַ�
	ʹ��group����ʱ���ȵ���find������ƥ����ȥ���ҷ��ϵ��ַ���������group��ȡ
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
		//�����ص��ʽ����и�
		String string="��ҼҼҼҼҼ�����������õõ�Ҫ���������İ�";
//		�� ,,����������õõ�Ҫ���������İ�
		String[] attr=string.split("(.)\\1+");
		System.out.println(Arrays.toString(attr));
	}
	public static void replaceTest1(){
		String string="����ϵ13855430592 ����ϵ13855430592 ����ϵ13855430592 ����ϵ13855430592";
		String reg="1[34578]\\d{9}";
		string=string.replaceAll(reg, "****");
		System.out.println(string);
	}
	public static void replaceTest2(){
		String str="������ҪҪ�úõ�ѧѧϰϰ";
		str=str.replaceAll("(.)\\1+","$1");
		System.out.println(str);
	}

}
