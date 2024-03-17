package com.myThread;

class Userthread extends Thread{
	public void run() {
		System.out.println("User define thread");
	}
}

public class ThreadOp {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("program started !!");
		int x=56+34;
		System.out.println("sum is "+x);
		Thread currentThread = Thread.currentThread();
		System.out.println("Current Thread : "+currentThread.getName());
		
		currentThread.setName("MyMainThread");
		System.out.println("Current Thread chnaged : "+currentThread.getName());
		System.out.println("Current Thread ID : "+currentThread.getId());
		
		Thread.sleep(5000);
		
		Userthread userthread= new Userthread();
		userthread.start();
		System.out.println("Current Thread chnaged : "+currentThread.getName());
		
		System.out.println("program ended..");
	}
}
