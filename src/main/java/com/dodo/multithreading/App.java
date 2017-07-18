package com.dodo.multithreading;

import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		// Calculator
		/*for (int i = 1; i <= 10; i++) {
			Calculator calculator = new Calculator(i);
			Thread thread = new Thread(calculator);
			thread.start();
		}*/
		
		// PrimeGenerator
		/*Thread task = new PrimeGenerator();
		task.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		task.interrupt();*/
		
		//FileSearch
		FileSearch searcher=new FileSearch("C:/","README.md");
		Thread thread=new Thread(searcher);
		thread.start();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}
}
