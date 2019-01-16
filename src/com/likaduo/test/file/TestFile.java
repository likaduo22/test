package com.likaduo.test.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * @author CHL
 * 
 */
public class TestFile {
	
	public static void main(String[] args) throws IOException {
		//File f = new File();
		//OutputStream os = new FileOutputStream();
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("F:/image/tp.jpg"));  //原先图片所在路径
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("E:/image/aa.jpg"));  //你要保存在哪个目录下面
		int i ;
		while((i=in.read())!= -1){
			out.write(i);
		}
		out.flush();
		out.close();
		in.close();
}
}