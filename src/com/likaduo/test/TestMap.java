package com.likaduo.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author CHL
 * 
 */
public class TestMap {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("1", "22");
		map.put("2", "21");
		map.put("3", "23");
		map.put("4", "24");
		map.put("5", "25");
		System.out.println("通过遍历key,遍历value");
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		System.out.println("");
		
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		
		while(it.hasNext()){
			
			Map.Entry<String, String> entry = it.next();
			
			System.out.println(entry.getValue());
			
		}
	}
}
