package com.shermin.stream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class MaBiao {

	public static void main(String[] args) throws UnsupportedEncodingException {
	String string="aÖÐ¹ú";
	byte[] buf=string.getBytes("unicode");
	System.out.println(Arrays.toString(buf));
	string=new String(buf,"unicode");
	System.out.println(string);
	}

}
