package com.likaduo.test.thred;
/**
 * @author CHL
 * 
 */
public class Player extends Thread {

	public void run(){
		System.out.println(getName()+"登场了");
		
		int count = 0;
		boolean keeppalying = true;
		while(keeppalying){
			
			System.out.println(getName()+"登场此数"+(++count));
			
			if(count == 10){
			keeppalying = false;
		}	
			
			if(count%2 == 0){
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
		}
		System.out.println(getName()+"踢完了");
	}
	
	public static void main(String[] args) {
		Thread player = new Player();
		
		player.setName("切尔西");
		
		player.start();
		
		Thread assplayb = new Thread(new PlayerB());
		
		assplayb.setName("巴萨罗纳");
		
		assplayb.start();
		
		
		
	}
	

}
	

