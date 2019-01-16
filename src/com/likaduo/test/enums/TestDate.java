package com.likaduo.test.enums;


public class TestDate {
	public static void main(String[] args) {
		/**
		 * 利用格式获取时间
		 */
		/*Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");//利用SimpleDateFormat格式化获取时间
		System.out.println("当前时间为:"+sdf.format(date));//获取当前时间
*/		

		/**
		 * 利用Calendar类修改或获取某个时间的值
		 */
		/*	
		Calendar calendar = Calendar.getInstance();//通过获取的时间可以获取或者设置某个时间段的值
		calendar.set(2010, 9, 26);//设置
		int year = calendar.get(Calendar.YEAR);//获取
		System.out.println(year);*/
		
		/**
		 * 可以利用date计算2次方法执行所花费的时间
		 */
	/*	SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
		long start = System.currentTimeMillis();//获取当前时间戳
		System.out.println(sdf.format(new Date()));//利用格式输出当前时间
		try {
			Thread.sleep(1000*3);//休眠3秒
			System.out.println(sdf.format(new Date()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();//休眠后获取时间戳
		long time = end - start;//2次之间时间的间隔
		System.out.println(time);*/
	}
}
