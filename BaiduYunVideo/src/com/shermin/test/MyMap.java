package com.shermin.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;;

public class MyMap {

	public static void main(String[] args) {
//		Map<String,String> map=new HashMap<String, String>();
//		map.put("player", "Kobe");
//		map.put("singler", "Hebe");
//		map.put("former", "DeGuangxia");
//		map.put("teacher", "QingCangyu");
//		map.put("Master", "Me");
//	
//		Map<String,String> map2=new HashMap<String, String>();
//		map2.put("teacher2", "QingCangyu");
//		map2.put("Master2", "Me");
//		map.putAll(map2);
//		System.out.println(map2);
//		System.out.println(map);
//		//System.out.println("THe delwete data is :"+map.remove("Master"));
//		System.out.println(map.get("player"));
//		System.out.println("map==   "+map);
//		System.out.println("Map Size():  "+map.size());
//		System.out.println("Map exsit that key??  "+map.containsKey("former"));
//		System.out.println("Map exsit that key??"  +map.containsKey("formerE"));
//		System.out.println("Map exsit that value?? "  +map.containsKey("LBJ"));
//		System.out.println("Map exsit that value?? "  +map.containsKey("Hebe"));
//		System.out.println("Map == NULL?? "  +map.isEmpty());
//		map2.clear();
//		System.out.println("Map2 == NULL?? "  +map2.isEmpty());
//		Set ssSet=map.entrySet();
//		System.out.println("ssSet="+ssSet);
//		
		
		
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "hhhaa");
		map.put(2, "gggaa");
		map.put(3, "rrraa");
		map.put(5, "ddda");
		map.put(7, "eeeaa");
		System.out.println("map======="+map);
		
		Set<Integer> kSet=map.keySet();
		Iterator<Integer> iterator=kSet.iterator();
		while(iterator.hasNext()){
			Integer keyInteger=iterator.next();
			String valueString=map.get(keyInteger);
			System.out.println("key="+keyInteger+"   value="+valueString);
		}
		
		
		Collection<String> vcCollection=map.values();
		Iterator<String> iterator2=vcCollection.iterator();
		while (iterator2.hasNext()) {
		String valueString=iterator2.next();
		System.out.println("value=="+valueString);
		}
		
		Set<Map.Entry<Integer, String>> es=map.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator3=es.iterator();
		while(iterator3.hasNext()){
			Map.Entry<Integer, String> entry=iterator3.next();
			Integer keyInteger=entry.getKey();
			String valueString=entry.getValue();
			System.out.println("key=="+keyInteger+"  value="+valueString);
		}
		for (Map.Entry<Integer, String> entry : es) {
			
			System.out.println(entry.getKey()+entry.getValue()
					);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//map2.clear();
	//	System.out.println(map2);
	}

}
