package com.shermin.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;

class Book implements Comparable<Book>{
	String name;
	String date;
	public Book(String name,String date) {
		this.name=name;
		this.date=date;
	}
	public int compareTo(Book o) {
		SimpleDateFormat smf=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=null;
		Date d2=null;
		try {
			d1=smf.parse(this.date);
			d2=smf.parse(o.date);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//return this.date.compareTo(o.date);
		return d1.compareTo(d2);
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "[ 书名: "+this.name+" 出版日期: "+this.date;
	}
}
public class BookManager {

	public static void main(String[] args) {
    TreeMap<Book, String> map=new TreeMap<Book, String>();
    map.put(new Book("红楼梦", "1997-11-11"),"001");
    map.put(new Book("天使的心", "1992-1-19"),"002");
    map.put(new Book("楼兰帮派", "2020-12-13"),"003");
    map.put(new Book("琅琊榜", "2015-10-12"),"004");
    map.put(new Book("古山行", "2016-07-20"),"005");
    System.out.println(map);
    
    
	}

}
