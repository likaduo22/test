package com.likaduo.test.thred;



/**
 * @author CHL
 * 
 */
public class TeamChelsea extends Thread{
	public  boolean keepAcct = true;

	public void run(){
		
	
		while(keepAcct){
		
			
			for(int i = 0 ; i< 3; i++){
			
				//发动一次短传渗透
				System.out.println(Thread.currentThread().getName()+"发动短传渗透一次["+i+"]");
				//让出处理器时间,对方也可以反击
				
		/*		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				Thread.yield();
				
			}
		}
			System.err.println(Thread.currentThread().getName()+"结束了短传");
		
		
	}
}
