package com.porwau.concepts.concurrency;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class HttpTask implements Runnable{
	
	private String url;

	public HttpTask(String url) {
		this.url = url;
	}

	@Override
	public void run() {
		URL uri = null;
		try {
			uri = new URL(url);

		//	System.out.println("Started checking " + uri.toString() + "at " + Calendar.getInstance().getTimeInMillis());
			HttpURLConnection conn = (HttpURLConnection) uri.openConnection(); 
			conn.setRequestMethod("GET");//this is default
			conn.connect();
			int responseCode = conn.getResponseCode();		
			if (responseCode == 200) {
				System.out.println(uri.toString() + " is Green at " + Calendar.getInstance().getTimeInMillis());
			}else {
				System.out.println(uri.toString() + " is Yellow with RC " + responseCode + " at " + Calendar.getInstance().getTime());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(uri.toString() + " is Red : Invalid URL/Domain");
		}finally {
			try {
				Thread.sleep(5000);
				System.out.println("done sleeping at " + Calendar.getInstance().getTime());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
}
public class ThreadParallel {

	public static void main(String[] args) {
		String[] list1 = {"https://google.co.in","https://en.wikipedia.org/wiki/Session_ID"} ;
		String[] list = { "http://crunchify.com", "http://yahoo.com", "http://www.ebay.com", "http://google.com",
				"http://www.example.co", "https://paypal.com", "http://bing.com/", "http://techcrunch.com/", "http://mashable.com/",
				"http://thenextweb.com/", "http://wordpress.com/", "http://wordpress.org/", "http://example.com/", "http://sjsu.edu/",
				"http://ebay.co.uk/", "http://google123.co.uk/", "http://wikipedia.org/", "http://en.wikipedia.org" };
		
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		for(int i = 0 ; i<list.length;i++) {
			//System.out.println(list[i]);
			
			HttpTask ht = new HttpTask(list[i]);
			threadPool.submit(ht);
			//Thread t = new Thread(ht);
			//t.start();
			
		}
		threadPool.shutdown();
		while (!threadPool.isTerminated()) {
			// System.out.println("Waiting to shutdown");
		}
	}
}