package com.myThread;

public class anotherThread extends Thread{
	public void run() {
		for(int i =10;i>=1;i--)
		{
			System.out.println("Another Thread is running i : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
