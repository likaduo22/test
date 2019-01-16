package com.likaduo.test.extend;
/**
 * @author CHL
 * 
 */
public class Cat extends Amanils{

	public Cat(String name, int weight, int id) {
		super(name, weight, id);
		// TODO Auto-generated constructor stub
	}

	
	
   public void eat(){
	   super.eat();
	   this.eatT();
	   
   }

	public void eatT(){
		System.out.println("我吃鱼");
		
	}
	
}
