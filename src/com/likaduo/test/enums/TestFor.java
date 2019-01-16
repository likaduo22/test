package com.likaduo.test.enums;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class TestFor {
   public static void main(String[] args) {
/*	   System.out.print("同学状态输入:");
	   Scanner scan = new Scanner(System.in);

	   Integer i = scan.nextInt();*/
	 /*  StringBuilder sb = new StringBuilder("斯坦福桥有限出租车公司:");
	   sb.append("魔兽");
	   sb.append("德罗巴");
	   System.out.println(sb);
	   System.out.println(sb.charAt(3));*/
	   int[] num  ={1,2,3,4};
	   int[] xx  = {1,2,3,4,5};
	 /*  Arrays.sort(num);	
	  for (int i : num) {
		System.out.println(i);
	}*/
	    if(Arrays.equals(num,xx)){
		   System.out.println("相等！");
	   }else{
		   System.out.println("不相等!");
	   }
	   
	   /*	  try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	  try {
		  int i = scan.nextInt();
		  switch (i) {
			case 2:
				System.out.println("该同学不合格");
				break;
			case 3:
				System.out.println("该同学合格");
				break;
			case 4:
				System.out.println("该同学良");
				break;
			case 5:
				System.out.println("该同学优秀");
				break;
			default:
				System.out.println("没有改状态！");
				break;
		}
	} catch (Exception e) {
			System.out.println("请输入对应状态!");
	} 
*/   }
  }

