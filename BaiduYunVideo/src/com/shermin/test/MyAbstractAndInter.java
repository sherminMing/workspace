package com.shermin.test;
class Outer{
	int x=100;
	class Inner{
		int x=10;
		int i=10;
		public void print(){
			System.out.println("�ڲ����x="+i);
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
		System.out.println("��ӳɹ�....");
		
	}

	public void delete() {
		System.out.println("ɾ���ɹ�......");
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
	System.out.println(this.name+"��......");	
	}
	public void NiMing(){
		//�����ڲ���
		new Outer(){}.getInner();;
	}
}
class Fish extends Animal{
	public Fish(String name){
		super(name);
	}
	public void run() {
		System.out.println(this.name+"�ΰ���......");	
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
		
		
		
//		Mouse mouse=new Mouse("������");
//		Fish fish=new Fish("����");
//		print(mouse);
//		print(fish);
//		
		
		
		//�ӿڵ��������ͱ���ָ���˽ӿڵ�ʵ�������
		
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
	//�����ڲ���
	new Mouse("kk").NiMing();
}
}
