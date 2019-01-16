package com.likaduo.test.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author CHL
 * 
 */
public class TestList {
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		
		l.add("220");
		l.add("221");
		l.add("222");
		l.add("225");
		l.add("228");
		l.add("224");
		l.add("223");
		l.add("226");
		
	//迭代器遍历
	/*	Iterator<String> it = l.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			
		}*/
	
		//foeeach遍历
		/*	
		for (String string : l) {
			System.out.println(string);
			
		}*/
		
		//for循环遍历
		/*	for(int i = 0;i<l.size();i++){
			System.out.println(l.get(i));
			
		}
		
	}*/

}
}
