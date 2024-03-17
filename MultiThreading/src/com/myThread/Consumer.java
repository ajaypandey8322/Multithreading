package com.myThread;

public class Consumer extends Thread {

	Company company;

	public Consumer(Company company) {
		super();
		this.company = company;
	}

	public void run() {
		while(true)
		{
			try {
				this.company.consume_item();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
}
