package com.myThread;

public class Company {
	
	int n;
	boolean stock=false;
	
	synchronized public void produce_item(int n) throws InterruptedException {
		
		if(stock)
			wait();
		this.n=n;
		System.out.println("Produced : "+this.n);
		stock=true;
		notify();
	}
	synchronized public int consume_item() throws InterruptedException {
		
		if(!stock)
			wait();
		System.out.println("Consumed : "+this.n);
		stock=false;
		notify();
		return this.n;
	}

}
