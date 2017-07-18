package com.dodo.multithreading;

public class PrimeGenerator extends Thread {
	@Override
	public void run() {
		long number = 1L;
		while (true) {
			if (isPrime(number)) {
				System.out.printf(Thread.currentThread().getName() + " Number %d is Prime\n", number);
			}
			if (isInterrupted()) {
				System.out.println(Thread.currentThread().getName() + " The Prime Generator has been Interrupted");
				return;
			}
			number++;
		}
	}

	private boolean isPrime(long number) {
		if (number <= 2) {
			return true;
		}

		for (long i = 2; i < number; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;
	}
}
