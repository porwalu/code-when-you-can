package com.porwau.concepts.concurrency;

public class JoinDemo implements Runnable
{
    public void run()
    {
        //Thread t = Thread.currentThread();
        System.out.println("Current thread: "
                               + Thread.currentThread().getName());
  
        // checks if current thread is alive
        System.out.println("Is Alive? "
                               + Thread.currentThread().isAlive());
        try {
			Thread.sleep(1010);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
  
    public static void main(String args[]) throws Exception
    {
        Thread t = new Thread(new JoinDemo());
        t.setName("subthread");
        t.start();
//        Thread.currentThread().join();
  
        // This thread i.e. Main thread Waits for 1000ms for thread 't' to die.
        t.join(1000);
  
        System.out.println("\nJoining after 1000"+
                             " mili seconds: \n");
        System.out.println("Current thread: " +
                                    t.getName());
  
  
        // Checks if this thread is alive
        System.out.println("Is alive? " + t.isAlive());
    }
}