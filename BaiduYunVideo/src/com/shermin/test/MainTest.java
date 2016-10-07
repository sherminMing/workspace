package com.shermin.test;

import java.util.Comparator;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;
/*
 * 恶汉单例模式，一个类在内存中只有一个对象
 */
class Cat{
	private static Cat cat=new Cat();
	private Cat(){
		
	}
	public static Cat getInstance(){
		return cat;
	}
	
}
/**
 * 
 * 懒汉单例模式
 *
 */
class Dog{
	private Dog(){}
	private static Dog dog;
	public static Dog getInstance(){
		if(dog==null){
			dog=new Dog();
			return dog;
		}
		return dog;
	}
	public static String contains(){
		return "name"+"age";
	}
}
class Emp implements Comparable{
	int id;
	String name;
	int salary;
	public Emp(int id,String name,int salary){
		super();
		this.name=name;
		this.id=id;
		this.salary=salary;
	}

	public String toString() {
		return "{"+"编号："+this.id+"姓名："+this.name+"薪水："+this.salary+"}";
	}

	public int compareTo(Object arg0) {
		Emp emp=(Emp) arg0;
		return this.salary-emp.salary;
	}
}
class MyComparator implements Comparator{

	public int compare(Object arg0, Object arg1) {
		Emp e1=(Emp) arg0;
		Emp e2=(Emp) arg1;
		return e1.id-e2.id;
	}
	
}
class FanXing<T>{
	public static void Say(){
		System.out.println("泛型...........");
	}
}
interface Dao<T>{
	public void add(T t);
}
public class MainTest<T> implements Dao<T>{

	public static void main(String[] args) {
/*
int[] a={11,23,4,8,-9,33,45};
String string=Arrays.toString(a);
System.out.println(string);
Arrays.sort(a);
string=Arrays.toString(a);
System.out.println(string);
if (Arrays.binarySearch(a, 3)<0) {
	System.out.println("can not find!");
}
*/
//	Cat cat=Cat.getInstance();
//	Cat cat1=Cat.getInstance();
//	System.out.println("cat1==cat:   "+(cat==cat1));
//	Dog dog=Dog.getInstance();
//	Dog dog2=Dog.getInstance();
//	System.out.println("dog==dog2:   "+(dog==dog2));
//	
//	//Object 类型的数组可以存储任意类型的数据
//	Object[] obb=new Object[5];
//	obb[0]=1;
//	obb[1]=1.1f;
//	obb[2]=2.3;
//	obb[4]='A';
//	obb[3]="like";
//	for (int i = 0; i < obb.length; i++) {
//		System.out.println(obb[i]);
//	}
//	Collection c=new ArrayList();
//	Collection c1=new ArrayList();
//	c1.add(1);
//	c1.add(1.1f);
//	c1.add(2.5);
//	c1.add(false);
//	c.add("123");
//	c.add('A');
//	c.add(1);
//	c.add(1.1f);
//	c.add(2.5);
//	c.add(false);
//	c.add(1);
//	System.out.println("Collection="+c);
//	System.out.println("Collection="+c1);
//	//c.remove(1.1f);
//	//c.removeAll(c1);
//	c.retainAll(c1);
//	System.out.println("Collection="+c);
//    System.out.println(c.size());
//    
//	System.out.println("Collection="+c);
//	System.out.println("Collection1="+c1);
//	
//	Object[] arr=c1.toArray();
//	System.out.println(Arrays.toString(arr));
//	Iterator iterator=c1.iterator();
//	while(iterator.hasNext()){
//		System.out.print(iterator.next()+"---");
//	}
//	iterator.remove();
//	System.out.println();
//	System.out.println(c1);
//	List list=new ArrayList();
//	list.add(1);
//	list.add(2);
//	list.add(0,23);
//	list.addAll(0,c1);
//	System.out.println(list);
//	for(int i=0;i<list.size();i++){
//		System.out.println("get:"+list.get(i));
//	}

	
/*
LinkedList linkedList=new LinkedList();
linkedList.add('A');
linkedList.add('c');
linkedList.add('d');
linkedList.add('a');
linkedList.add('w');
linkedList.add('s');

//System.out.println(linkedList.hashCode());
	Iterator iterator=linkedList.descendingIterator();
	
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
	
	
	
List alList=new ArrayList();
alList.add(12);

ListIterator listIterator2=alList.listIterator();


Vector eVector=new Vector();
eVector.addElement("QQ");
eVector.addElement("FaceBook");
eVector.addElement("WeiBo");
eVector.addElement("MSN");
Enumeration e=eVector.elements();
while (e.hasMoreElements()) {
	System.out.println(e.nextElement());
	
}
	
*/
	TreeSet<Emp> tSet=new TreeSet<Emp>(new MyComparator());
	tSet.add(new Emp(101,"ibe",300 ));
	tSet.add(new Emp(102,"uiobe",400 ));
	tSet.add(new Emp(103,"jobe",340 ));
	tSet.add(new Emp(104,"kokk",370 ));
	tSet.add(new Emp(105,"koft",700 ));
	tSet.add(new Emp(106, "jsbe",600 ));
	System.out.println(tSet);
	
	TreeSet<String> tSet2=new TreeSet<String>();
	tSet2.add("aname");
	tSet2.add("ww");
	tSet2.add("wwwww");
	tSet2.add("0zrde");
	tSet2.add("ss");
	System.out.println(tSet2);
	
	
	TreeSet<Emp> ts2=new TreeSet<Emp>(new MyComparator());
	
	ts2.add(new Emp(101,"ibe",300 ));
	ts2.add(new Emp(102,"uiobe",400 ));
	ts2.add(new Emp(103,"jobe",340 ));
	ts2.add(new Emp(104,"kokk",370 ));
	ts2.add(new Emp(105,"koft",700 ));
	ts2.add(new Emp(106, "jsbe",600 ));
	System.out.println(ts2);
	
	int a=functionName(3);
	System.out.println("a="+a);
	FanXing<Integer> fXing=new FanXing<Integer>();
	fXing.Say();
	
	
	
	
	
	
	
	
	
	}
	//自定义泛型
	public static <T> T functionName(T t){
		return t;
	}
	public void add(Object t) {
		// TODO 自动生成的方法存根
		
	}
}
