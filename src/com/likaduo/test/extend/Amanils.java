package com.likaduo.test.extend;
/**
 * @author CHL
 * 
 */
public class Amanils {

	private String name;
	private int weight;
	private int id;
	
	public Amanils(String name, int weight, int id) {
		super();
		this.name = name;
		this.weight = weight;
		this.id = id;
	}
	
	
	public void eat(){
		System.out.println("大家好我是"+name+"我的重量是"+weight+"kg"+"我正在吃");
	};
	
	
	
	
}
