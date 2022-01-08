package com.porwau.test;

public class DeadLockDemo {

	public static void main(String[] args) throws InterruptedException {
		String str1 = "Utkarsh";
		String str2 = "porwal";
		//Task t = new Task();
		Thread.sleep(1000);
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized(str1) {
					System.out.println("Got str1 from t1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Trying to get str2 lock from t1");
					synchronized (str2) {
						System.out.println("Got both locks from t1");
					}
				}
			}
			
		});
		Thread t2 = new Thread(()-> {
			synchronized(str2) {
				System.out.println("Got str2 from t2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Trying to get str1 lock from t2");
				synchronized (str1) {
					System.out.println("Got both locks from t2");
				}
			}
			
		});

		t1.start();
		t2.start();

	}

}
