package com.likaduo.test.abstracts;
/**
 * @author CHL
 * 
 */
public abstract class Player {

	private String name;
	private int num;
	private int speed;
	
	
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Player(String name, int num,int speed) {
		super();
		this.name = name;
		this.num = num;
		this.speed = speed;
	}
	
	public void speed(String name,int num,int speed){
		//this.name = name;
		System.out.println(num+"号"+name+"绝对速度 .."+speed);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
