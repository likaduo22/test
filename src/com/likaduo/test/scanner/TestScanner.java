package com.likaduo.test.scanner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author CHL
 * 
 */
public class TestScanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] st = {"chen","li","wang"};
		
		System.out.println("请输入查询姓名:");
		if(sc.hasNextLine()){
			String ss = sc.nextLine();
			//for (String string : st) {
				if(Arrays.asList(st).contains(ss)){
					System.out.println("请输入查询成绩:");
					if(sc.hasNext()){
						try {
							int key = sc.nextInt();
							if(key < 60){
								System.out.println("成绩不合格！");
								//break;
							}else if(key > 60 && key < 85){
								System.out.println("成绩为良！");
								//break;
							}else if(key > 85){
								System.out.println("成绩为优！！");
								//break;
							}else{
								System.out.println("查无此成绩！！！！");
								//break;
							}
						} catch (Exception e) {
							System.err.println("请输入正确的成绩！！");
							// TODO: handle exception
						}
						
					}
				}else{
					System.out.println("没有此人！！");
				}
				
			//}
			
		}
		
	
		
	}

}
