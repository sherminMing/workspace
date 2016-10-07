package com.shermin.test;
/*
 * toString() 
          ���ظö�����ַ�����ʾ��
 * equals(Object obj) 
          ָʾĳ�����������Ƿ���˶�����ȡ���
 * hashCode() 
          ���ظö���Ĺ�ϣ��ֵ��
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
		Person p1=new Person(100,"У��");
		Person p2=new Person(102,"΢΢");
		System.out.println("p1==p1??"+p1.equals(p2));
	
	}

}
