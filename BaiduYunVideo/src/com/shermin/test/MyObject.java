package com.shermin.test;
/*
 * toString() 
          返回该对象的字符串表示。
 * equals(Object obj) 
          指示某个其他对象是否与此对象“相等”。
 * hashCode() 
          返回该对象的哈希码值。
 * 
 * 
 * 
 * 
 * 
 * 
 */
class Person implements Comparable<Person>{
	int id;
	String name;
	public Person(int id,String name){
		this.name=name;
		this.id=id;
	}
	public boolean equals(Object obj) {
		Person person=(Person)obj;
		return this.id==person.id;
	}
	public int hashCode() {
		return this.id;
	}
	public int compareTo(Person o) {
		return this.id-o.id;
	}
	
	public String toString() {
		return "["+this.id+this.name+"]";
	}
}
public class MyObject {

	
	public static void main(String[] args) {
Object object=new Object();
//	System.out.println("toString():  "+object.toString());
//	System.out.println("getClass().getName():  "+object.getClass().getName());
//	System.out.println("getClass():    "+object.getClass());
System.out.println(object);
		Person p1=new Person(100,"校草");
		Person p2=new Person(102,"微微");
		System.out.println("p1==p1??"+p1.equals(p2));
	
	}

}
