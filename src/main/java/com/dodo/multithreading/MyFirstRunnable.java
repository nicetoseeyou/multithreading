package com.dodo.multithreading;

public class MyFirstRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		Thread thread = new Thread(new MyFirstRunnable());

		Runnable anonymousInnerRunnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous Inner Runnable " + Thread.currentThread().getName());
			}
		};

		Thread thread2 = new Thread(anonymousInnerRunnable);

		thread.start();
		thread2.start();
		thread.run();
	}

}
