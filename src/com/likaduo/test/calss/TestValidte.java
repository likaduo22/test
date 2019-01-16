package com.likaduo.test.calss;
/**
 * @author CHL
 * 
 */
public class TestValidte {
	String a = "100";
	String b = "100";
	String c = "102";
	public boolean validate(){
		
	if(a.equals(b) || a.equals(c)){
		return true;
	}else {
		return false;
	}
}
}