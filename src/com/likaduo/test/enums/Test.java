package com.likaduo.test.enums;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author CHL
 * 
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(1543290535229l);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(d));
	}

}
