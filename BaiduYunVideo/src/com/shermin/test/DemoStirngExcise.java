package com.shermin.test;

public class DemoStirngExcise {

	public static void main(String[] args) {
	String string="   woshi xiaoming     ";
	String filepathString="D:\\Program Files (x86)\\Java\\jdk1.8.0_45\\ls.java";
	System.out.println(MyTrim(string));
    System.out.println(getFileName(filepathString));
    System.out.println(reverse(MyTrim(string)));
	}
	public static String reverse(String str){
		char[] arr=str.toCharArray();
		for(int startIndex=0,endIndex=arr.length-1;startIndex<endIndex;startIndex++,endIndex--){
			char temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
		}
		return new String(arr);
		
	}
	public static String getFileName(String path){
		//int index=path.lastIndexOf('\\');
		//return path.substring(index+1);
		String[] cccStrings=path.split("\\\\");
		return cccStrings[cccStrings.length-1];
	}
	public static String MyTrim(String string){
		char[] c=string.toCharArray();
		int startIndex=0;
		int endIndex=c.length-1;
		while(true){
			if(c[startIndex]==' '){
				startIndex++;
			}else{
				break;
			}
		}
		while (true) {
			if(c[endIndex]==' '){
					endIndex--;
		}else{
			break;	
			}
			}
		return string.substring(startIndex,endIndex+1);
	}

}
