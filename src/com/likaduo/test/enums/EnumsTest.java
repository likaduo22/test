package com.likaduo.test.enums;




class FreshJuice{
	enum  FreshJuiceSize{SMALL,MEDIUM,LARGE }
	FreshJuiceSize size;
	
}
public  class EnumsTest {
	
	public static void main(String[] args) {
		FreshJuice freshJuice = new FreshJuice();
		freshJuice.size = FreshJuice.FreshJuiceSize.LARGE;
		
		
		
	}
}
