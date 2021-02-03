package com.porwau.playarea;
import java.lang.Runnable;
public class ThreadPlay {
	public static void main(String []args) {
		TaskNew tn  = new TaskNew();
		Thread t = new Thread(tn);
		t.start();
	}
}

class TaskNew implements Runnable{

	@Override
	public void run() {
		System.out.println("Running task 1");
		work();
		workmore();
	}

	private void work() {
		System.out.println("Running task work");
		
	}

	private void workmore() {
		System.out.println("Running task work more");
	}	
	
	
}
