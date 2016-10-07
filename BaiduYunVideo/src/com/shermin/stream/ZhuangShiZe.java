package com.shermin.stream;
interface Work{
	public void work();
}
class Son implements Work{
	public void work() {
	System.out.println("ª≠ª≠.....");
	}
}
class Mother implements Work{
	Work worker;
	public Mother(Work work) {
		this.worker=work;
	}
	public void work() {
		worker.work();
		System.out.println("…œÕø¡œ.....");	
	}
}
class Father implements Work{
	Work worker;
	public Father(Work work) {
		this.worker=work;
	}
	public void work() {
		worker.work();
		System.out.println("…œª≠øÚ.....");
		
	}
}
public class ZhuangShiZe {

	public static void main(String[] args) {
		Son son=new Son();
		son.work();
		Mother mother=new Mother(son);
		mother.work();
		Father father=new Father(mother);
		father.work();
	}

}
