package com.shermin.DesignModel;
class Per{
	private int id;
	private String name;
	public Per(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "["+" ±àºÅ£º "+this.id+" ĞÕÃû : "+this.name +"]";
	}
	public void eat(int num){
		System.out.println(this.name+"Eat....."+num+" Íë·¹");
	}
	public static void sleep(){
		System.out.println("Sleep....");
	}
	public void getArrSize(int[] arr){
		System.out.println("length="+arr.length);
	}
	private Per(){}
}