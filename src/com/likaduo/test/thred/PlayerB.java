package com.likaduo.test.thred;
/**
 * @author CHL
 * 
 */
public class PlayerB implements Runnable{

	@Override
	public void run() {

				System.out.println(Thread.currentThread().getName()+"登场了");
				
				int count = 0;
				boolean keeppalying = true;
				while(keeppalying){
					
					System.out.println(Thread.currentThread().getName()+"登场此数"+(++count));
					
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
				System.out.println(Thread.currentThread().getName()+"踢完了");
				
			}
		}
	


