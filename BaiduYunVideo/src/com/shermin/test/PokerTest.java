package com.shermin.test;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

class Poker{
	String color;
	String num;
	public Poker(String color,String num){
		this.color=color;
		this.num=num;
	}

	public String toString() {
		return "[ "+this.color+this.num+" ]";
	}
	public static void printPoker(LinkedList<Poker> hSet){
		Iterator<Poker> iterator=hSet.iterator();
		int i=0;
		while (iterator.hasNext()) {
			Poker p=iterator.next();
			System.out.print(p+"  ");
			i++;
			if(i%5==0)
				System.out.println();
		}
		System.out.println();
	}
	public static void disturbPoker(LinkedList<Poker> linkedList){
		//Iterator<Poker> iterator=linkedList.iterator();
	    Random random=new Random();
	    for(int i=0;i<100;i++){
	    int a=random.nextInt(linkedList.size());
		int b=random.nextInt(linkedList.size());
	    Poker p1=linkedList.get(a);
	    Poker p2=linkedList.get(b);
	    linkedList.set(a, p2);
	    linkedList.set(b, p1);
	    }
	}
}
public class PokerTest {

	public static void main(String[] args) throws FileNotFoundException {
		String[] color={"梅花","红桃","黑桃","方片"};
		String[] num={"A","2","3","4","5","6","7","8","9","十","J","Q","K"};
		LinkedList<Poker> ls=new LinkedList<Poker>();
		for (int i = 0; i < color.length; i++) {
			for (int j = 0; j < num.length; j++) {
				Poker poker=new Poker(color[i], num[j]);
                ls.add(poker);
			}
		}
		//PrintStream printStream=new PrintStream("F:\\shermin.txt");
		//System.setOut(printStream);
	//	System.out.println(hSet);
		System.out.println("洗牌前.........");
		Poker.printPoker(ls);
		Poker.disturbPoker(ls);
		System.out.println("洗牌后.........");
		Poker.printPoker(ls);
		//System.out.println("扑克数量:  "+ls.size());
		
		
	}

}
