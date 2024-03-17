package com.myThread;

public class Mythread implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<=10;i++)
		{
			System.out.println("Value of i is "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Mythread mThread = new Mythread();
		Thread mythread= new Thread(mThread);
		anotherThread anThread= new anotherThread();
		
		mythread.start();
		anThread.start();
		
		
		}

}
