package com.likaduo.test.thred;
/**
 * @author CHL
 * 斯坦福桥球场
 */

public class Court<sout> extends Thread{
	
	
	public void run(){
		
		System.err.println("切尔西与巴萨罗那比赛即将开始");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.err.println("切尔西与巴萨罗那欧冠决赛由喜力赞助播出");
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		TeamChelsea chelseaTeam = new TeamChelsea();
		
		TeamChelsea barcelonaTeam = new TeamChelsea();
		//使用Runnable接口创建线程
		Thread chelseaOfTeam = new Thread(chelseaTeam,"切尔西");
		Thread barcelonaOfTeam = new Thread(barcelonaTeam,"巴萨罗那");
		
		//启动线程，让球队开始比赛
		chelseaOfTeam.start();
		barcelonaOfTeam.start();
		//球场休眠 看球队比赛
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Thread mrD = new KeyPlayer();
		
		mrD.setName("迪迪尔 德罗巴");
		
		System.err.println("补时最后时刻德罗巴站了出来");
	
		System.err.println("德罗巴想终结比赛");
		
		//停止进攻
		chelseaTeam.keepAcct = false;
		barcelonaTeam.keepAcct = false;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//德罗巴终结
		mrD.start();

		
		try {
			mrD.join();
		} catch (InterruptedException e) {
	   		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.err.println("德罗巴终结了比赛,切尔西获取欧冠冠军");
		/*chelseaTeam.keepAcct = false;
		barcelonaTeam.keepAcct = false;
		
		try {
			barcelonaOfTeam.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}
	public static void main(String[] args) {

	    new Court().start();
	}


}
