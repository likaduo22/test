package com.likaduo.test.beanutil;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @author CHL
 * 
 */
public class TestBeanUtil {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap();
		map.put("name", "kaka");
		map.put("age", "22");
		
		JavaBean java = new JavaBean();
		
		try {
			BeanUtils.populate(java, map);
			System.out.println(java);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
