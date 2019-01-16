package com.likaduo.test.calss;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CHL
 * 
 */
public class For {
	String a = "100";
	String b = "100";
	String c = "102";
 	public void Test(){
	
	
	List<String> l = new ArrayList<String>();
	
	//TestValidte t = new TestValidte();
	
	int i;
	for(i = 0 ;i < 100000000 ; i++){
	
		
		if(a.equals(b) || a.equals(c)){
			l.add("!!!!!");
			
		}
		
		
	

	}
	System.out.println(l.size());
}
}
