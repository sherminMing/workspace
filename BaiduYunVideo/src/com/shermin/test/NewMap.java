package com.shermin.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NewMap {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("202", "立波");
		map.put("315", "超超");
		map.put("317", "阿勇");
		map.put("301", "蜀黍");
		map.put("305", "明明");
		Set<String> keys=map.keySet();
		Iterator<String> iterator=keys.iterator();
		while(iterator.hasNext()){
			String keyString=iterator.next();
			System.out.println("键： "+keyString+" 值: "+map.get(keyString));
		}
		System.out.println("*********************************");
		Collection<String> collection=map.values();
		Iterator<String> iterator2=collection.iterator();
		while (iterator2.hasNext()) {
			String string = (String) iterator2.next();
			System.out.println("值："+string);
		}
		System.out.println("************Entry**************");
		Set<Map.Entry<String, String>> entries=map.entrySet();
		Iterator<Map.Entry<String, String>> iterator3=entries.iterator();
		while (iterator3.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry =
					(Map.Entry<java.lang.String, java.lang.String>) iterator3.next();
			System.out.println("键： "+entry.getKey()+" 值: "+entry.getValue());
		}
		
		
		
		
		
	}

}
