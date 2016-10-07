package com.shermin.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class MyDate {

	public static void main(String[] args) throws ParseException {
	    Date date=new Date();
		System.out.println(date);
		
		Calendar calendar=Calendar.getInstance();
		System.out.println("年:"+calendar.get(Calendar.YEAR));
		System.out.println("月:"+(calendar.get(Calendar.MONTH)+1));
		System.out.println("年:"+calendar.get(Calendar.DATE));
		System.out.println("时："+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("分:"+calendar.get(Calendar.MINUTE));
		System.out.println("分:"+calendar.get(Calendar.SECOND));
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM日dd日   HH:mm:ss");
	    String time=simpleDateFormat.format(date);
	    System.out.println(time);
	    String birtString="2016年10日02日   13:28:57";
	    Date ddDate=simpleDateFormat.parse(birtString);
	    System.out.println(ddDate);
	    System.out.println("Math随机数:"+Math.random());
	}

}
