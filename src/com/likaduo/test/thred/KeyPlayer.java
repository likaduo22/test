package com.likaduo.test.thred;
/**
 * @author CHL
 * 
 */
public class KeyPlayer extends Thread{
	public void run(){
		
		System.err.println(Thread.currentThread().getName()+"开始跑动");
		
			for(int i = 0 ;i<1;i++){
				System.err.println(Thread.currentThread().getName()+"一脚爆射进球!");
			}
		
		System.err.println(Thread.currentThread().getName()+"想远道而来的球迷呐喊！！！！！we are champion");
	}

}
