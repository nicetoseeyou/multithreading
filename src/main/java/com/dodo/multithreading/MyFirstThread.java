package com.dodo.multithreading;

public class MyFirstThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyFirstThread myFirstThread = new MyFirstThread();

		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("Anonymous inner classes " + Thread.currentThread().getName());
			}
		};

		myFirstThread.start();
		thread.start();

		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			new Thread("" + i) {
				@Override
				public void run() {
					System.out.println("Thread: " + getName() + " running");
				}
			}.start();
		}
	}

}
