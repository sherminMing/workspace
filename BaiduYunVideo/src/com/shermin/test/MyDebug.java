package com.shermin.test;

public class MyDebug {

	public static void main(String[] args) {
	/*String qqString="13124141";
	if(qqString.startsWith("0")){
		if(qqString.length()>=5&&qqString.length()<=11){
			
			System.out.println("合法QQ号");
		}else{
			System.out.println("非法QQ,长度只能为5-11");
		}
	}else{
		System.out.println("不合法QQ号");
	}*/
		System.out.println("任意字符(.)  "+".ff".matches("."));
		System.out.println("数字字符(d)"+"1".matches("\\d"));
	}

}
