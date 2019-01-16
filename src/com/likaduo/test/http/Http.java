package com.likaduo.test.http;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author CHL
 * 
 */
public class Http {
	
	public static String poo(String post){
		try {
			URL u = new URL("http://www.baidu.com");
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			
			PrintWriter p = new PrintWriter(conn.getOutputStream());
			
			p.write(post);
			
			p.flush();

			BufferedInputStream bis = new BufferedInputStream(
					conn.getInputStream());
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int len;
			byte[] arr = new byte[1024];
			while ((len = bis.read(arr)) != -1) {
				bos.write(arr, 0, len);
				bos.flush();
			}
			bos.close();
			return bos.toString("utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
