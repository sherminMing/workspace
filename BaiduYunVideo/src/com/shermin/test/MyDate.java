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
		System.out.println("��:"+calendar.get(Calendar.YEAR));
		System.out.println("��:"+(calendar.get(Calendar.MONTH)+1));
		System.out.println("��:"+calendar.get(Calendar.DATE));
		System.out.println("ʱ��"+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("��:"+calendar.get(Calendar.MINUTE));
		System.out.println("��:"+calendar.get(Calendar.SECOND));
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy��MM��dd��   HH:mm:ss");
	    String time=simpleDateFormat.format(date);
	    System.out.println(time);
	    String birtString="2016��10��02��   13:28:57";
	    Date ddDate=simpleDateFormat.parse(birtString);
	    System.out.println(ddDate);
	    System.out.println("Math�����:"+Math.random());
	}

}
