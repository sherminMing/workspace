package com.shermin.test;
/*
 * 生产者消费者问题.......
 */
class Product{
	String name;
	double price;
	boolean flag=false;//产品是否生成完毕的标志
}
class Producter extends Thread{
	Product p;
	public Producter(Product p){
		this.p=p;
	}
	public Producter(String name){
		super(name);
	}
	public void run() {
		int i=0;
		while(true){
			synchronized (p) {
				
				if(p.flag==false){
					if(i%2==0){
						p.name="苹果";
						p.price=6.5;
					}else{
					p.name="香蕉";
					p.price=2;
					}
					System.out.println("生产者消费了:"+p.name+"价格："+p.price);
					p.flag=true;
					i++;
					p.notify();
				}else{
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
				
				
				
				
			}
		}
	}
}
class Customer extends Thread{
	Product p;
	public Customer(Product p){
		this.p=p;
	}
	public Customer(String name) {
		super(name);
	}
	public void run() {
	while(true){
   synchronized (p) {
	if(p.flag==true){
	   System.out.println("消费者消费了:"+p.name+"价格："+p.price);
	   p.flag=false;
	   p.notify();
	}else {
		//产品没生产
		try {
			p.wait();
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
   }
	}
	}
}
public class CommThread {

	public static void main(String[] args) {
	Product p=new Product();
	Producter producter=new Producter(p);
	Customer customer=new Customer(p);
	producter.start();
	customer.start();
	}

}
