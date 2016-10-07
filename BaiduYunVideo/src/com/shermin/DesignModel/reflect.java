package com.shermin.DesignModel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflect {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Per p=new Per(111, "齐昂梅");
		Class clazz=Class.forName("com.shermin.DesignModel.Per");
		System.out.println(clazz);
		/*Class clazz2=Per.class;
		System.out.println(clazz2);
		Class clazz3=new Per().getClass();
		System.out.println(clazz2);*/
		//Class->构造方法
		/*Constructor[] constructors=clazz.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}*/
		/*Constructor constructors=clazz.getConstructor(int.class,String.class);
		Per ppPer=(Per) constructors.newInstance(999,"感冒灵");
		System.out.println(ppPer);*/
		
		/*Constructor constructor=clazz.getDeclaredConstructor();
		System.out.println(constructor);
		constructor.setAccessible(true);
		Per p1=(Per) constructor.newInstance(null);
		System.out.println(p1);*/
		
	/*	 Method[] methods=clazz.getMethods();
		 for (Method method : methods) {
			System.out.println(method); 
		}	*/	
	/*	Method method=clazz.getMethod("eat",int.class);
		System.out.println(method);
		method.invoke(p, 10);
		Method method1=clazz.getMethod("sleep",null);
		method1.invoke(null, null);
		Method method3=clazz.getMethod("getArrSize",int[].class);
		method3.invoke(p,new int[]{1111,1,1,1,1,1,1,45,1,22,1,1,98,91});*/
		//成员变量
     /*   Field[] fields=clazz.getDeclaredFields();
        for (Field field : fields) {
			System.out.println(field);
		}*/
		
		Field field=clazz.getDeclaredField("id");
		field.setAccessible(true);
		field.set(p,476);
		System.out.println(p);
		
		
		
		
	}

}
