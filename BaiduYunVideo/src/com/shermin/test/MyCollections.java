package com.shermin.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyCollections {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(23);
		arrayList.add(233);
		arrayList.add(123);
		arrayList.add(523);
		arrayList.add(623);
		arrayList.add(273);
		arrayList.add(999);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		ArrayList<Person> arrayList1=new ArrayList<Person>();
		arrayList1.add(new Person(101,"��"));
		arrayList1.add(new Person(102,"����"));
		arrayList1.add(new Person(105,"����������"));
		arrayList1.add(new Person(103,"������"));
		arrayList1.add(new Person(106,"������������"));
		Collections.sort(arrayList1);
		System.out.println(arrayList1);
		
		System.out.println("���ֵ��"+Collections.max(arrayList));
		System.out.println("��Сֵ��"+Collections.min(arrayList));
        Collections.reverse(arrayList1);
        System.out.println(arrayList1);
       // arrayList=(ArrayList<Integer>) Collections.synchronizedCollection(arrayList);
        
        
        Integer[] arrIntegers={18,8,6,9};
        Integer[] arrIntegers2=Arrays.copyOf(arrIntegers, 6);
        Integer[] arrIntegers3=Arrays.copyOfRange(arrIntegers, 1, 3);
        System.out.println(Arrays.toString(arrIntegers2));
        System.out.println(Arrays.toString(arrIntegers));
        System.out.println("arr==arr2?"+Arrays.equals(arrIntegers, arrIntegers2));
        List<Integer> list= Arrays.asList(arrIntegers);
        System.out.println("list:"+list);
        
        System.out.println("�����ַ�(d)"+"1".matches("\\d"));
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
