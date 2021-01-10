package com.porwau.concepts.io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpConnect {

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public static void main(String[] args) throws MalformedURLException {

		String sourceUrl = "https://stackoverflow.com/questions/16255823/httpurlconnection-java-io-filenotfoundexception";
		connectToUrl(sourceUrl);
	}

	private static void connectToUrl(String sourceUrl) throws MalformedURLException {
		URL url = new URL(sourceUrl);
		HttpURLConnection conn = null;
		BufferedInputStream bi = null;
		try {
			 conn = (HttpURLConnection) url.openConnection();
			 if(conn.getResponseCode() >=200 && conn.getResponseCode() <400) {
				 //get data
				String webpage = IOUtil.read(conn.getInputStream());
				if(webpage !=null) {
					IOUtil.write(webpage);
				}
				 //bi = new BufferedInputStream(InputStreamReader);
			 }
			System.out.println(conn.getResponseCode());
			System.out.println(conn.getResponseMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conn.disconnect();
		}
//url.
//HttpURLConnection conn = new HttpURLConnection();

	}

}
