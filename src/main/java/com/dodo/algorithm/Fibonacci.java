package com.dodo.algorithm;

import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	for (int i = 0; i <= 46; i++) {
	    System.out.println("n=" + i + "\t" + fibonacci2(i) + "\t" + fibonacci4(i) + "\t" + fibonacci5(i));
	}
    }

    // 递归
    public static int fibonacci1(int n) {
	if (n < 0) {
	    throw new IllegalArgumentException("input must be positive");
	} else if (n == 0) {
	    return 0;
	} else if (n <= 2) {
	    return 1;
	} else {
	    return fibonacci1(n - 1) + fibonacci1(n - 2);
	}
    }

    // 递推
    public static int fibonacci2(int n) {
	if (n < 0) {
	    throw new IllegalArgumentException("input must be positive");
	} else if (n == 0) {
	    return 0;
	} else if (n <= 2) {
	    return 1;
	} else {
	    int a = 1, b = 1, c = 0;
	    for (int i = 1; i <= n - 2; i++) {
		c = a + b;
		a = b;
		b = c;
	    }
	    return c;
	}
    }

    // 递归
    public static BigInteger fibonacci3(int n) {
	if (n < 0) {
	    throw new IllegalArgumentException("input must be positive");
	} else if (n == 0) {
	    return new BigInteger("0");
	} else if (n <= 2) {
	    return new BigInteger("1");
	} else {
	    return fibonacci3(n - 1).add(fibonacci3(n - 2));
	}
    }

    // 递推
    public static BigInteger fibonacci4(int n) {
	if (n < 0) {
	    throw new IllegalArgumentException("input must be positive");
	} else if (n == 0) {
	    return new BigInteger("0");
	} else if (n <= 2) {
	    return new BigInteger("1");
	} else {
	    BigInteger a = new BigInteger("1");
	    BigInteger b = new BigInteger("1");
	    BigInteger c = null;
	    for (int i = 1; i <= n - 2; i++) {
		c = a.add(b);
		a = b;
		b = c;
	    }
	    return c;
	}
    }

    public static int[][] matixMultiply(int[][] a, int[][] b) {
	int[][] result = new int[2][2];
	result[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
	result[0][1] = a[0][0] * b[1][0] + a[0][1] * b[1][1];
	result[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
	result[1][1] = a[1][0] * b[1][0] + a[1][1] * b[1][1];
	return result;
    }

    public static int[][] basicMatix = { { 1, 1 }, { 1, 0 } };

    public static int[][] power(int n) {
	if (n <= 1) {
	    return basicMatix;
	} else if (n % 2 == 0) {
	    return matixMultiply(power(n / 2), power(n / 2));
	} else {
	    int[][] tmp = matixMultiply(power(n / 2), power(n / 2));
	    return matixMultiply(basicMatix, tmp);
	}
    }

    public static int fibonacci5(int n) {
	if (n < 0) {
	    throw new IllegalArgumentException("input must be positive");
	} else if (n == 0) {
	    return 0;
	} else if (n <= 2) {
	    return 1;
	} else {
	    return power(n - 1)[0][0];
	}
    }
}
