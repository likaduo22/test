package com.likaduo.test.abstracts;
/**
 * @author CHL
 * 
 */
public class Clplayer extends Player {

	public Clplayer(String name, int num,int speed) {
		super(name, num,speed);
		// TODO Auto-generated constructor stub
	}

	public void speed(String name,int num,int speed){
		//this.name = name;
		System.out.println(num+"号"+name+"绝对速度 "+speed);
		
	}
}
