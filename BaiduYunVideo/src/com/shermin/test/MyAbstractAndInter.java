package com.shermin.test;
class Outer{
	int x=100;
	class Inner{
		int x=10;
		int i=10;
		public void print(){
			System.out.println("内部类的x="+i);
		}
	}
	public void getInner(){
		Inner inner=new Inner();
		inner.print();
	}
}
interface Daos{
	public void add();
	public void delete();
}
class UserDao implements Daos{

	public void add() {
		System.out.println("添加成功....");
		
	}

	public void delete() {
		System.out.println("删除成功......");
	}
	
}
abstract class Animal{
	String name;
	public Animal(String name){
		this.name=name;
	}
	public abstract void run();
}
class Mouse extends Animal{

	public Mouse(String name) {
		super(name);
	}

	public void run() {
	System.out.println(this.name+"打洞......");	
	}
	public void NiMing(){
		//匿名内部类
		new Outer(){}.getInner();;
	}
}
class Fish extends Animal{
	public Fish(String name){
		super(name);
	}
	public void run() {
		System.out.println(this.name+"游啊游......");	
	}
}
public class MyAbstractAndInter {

	public static void main(String[] args) {
	
		
//	int[] arr={383,241,5656,-78,99,12,-1,60};
//	System.out.println("Before......");
//	for (int i = 0; i < arr.length; i++) {
//		System.out.print(arr[i]+"  ");
//		if(i==arr.length-1)
//			System.out.println();
//	}
//	for (int i = 0; i < arr.length-1; i++) {
//		for(int j=i+1;j<arr.length;j++){
//			if(arr[j]<arr[i]){
//				int temp=arr[j];
//				arr[j]=arr[i];
//				arr[i]=temp;
//			}
//		}		
//	}
//	System.out.println("After......");
//	for (int i = 0; i < arr.length; i++) {
//		System.out.print(arr[i]+"  ");
//		if(i==arr.length-1)
//			System.out.println();
//	}
		
		
		
//		Mouse mouse=new Mouse("米老鼠");
//		Fish fish=new Fish("鲲鹏");
//		print(mouse);
//		print(fish);
//		
		
		
		//接口的引用类型变量指向了接口的实现类对象
		
//		Daos dao=new UserDao();
//		dao.add();
//		dao.delete();
//	}
//public static void print(Animal m){
//	if(m instanceof Fish){
//		Fish fish=(Fish)m;
//		fish.run();
//	}else if(m instanceof Mouse){
//		Mouse mouse=(Mouse)m;
//		mouse.run();
	//}
		
		
		
		/*Outer outer=new Outer();
		outer.getInner();
		*/
	Outer.Inner inner=new Outer().new Inner();
	inner.print();
	//匿名内部类
	new Mouse("kk").NiMing();
}
}
