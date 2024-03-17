package com.myThread;

public class Producer extends Thread {

	Company company;

	public Producer(Company company) {
		super();
		this.company = company;
	}

	public void run() {
		int i = 1;
		while (true) {

			try {
				this.company.produce_item(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;

		}

	}
}
