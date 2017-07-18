package com.dodo.multithreading.chapter3.section2;

public class Main {
    public static void main(String[] args) {
        // 创建一个打印队列对象
        PrintQueue printQueue = new PrintQueue();

        // 创建10个线程
        Thread thread[] = new Thread[10];
        for (int i = 0; i < 10; i++) {
            thread[i] = new Thread(new Job(printQueue), "Thread " + i);
        }

        // 启动10个线程
        for (int i = 0; i < 10; i++) {
            thread[i].start();
        }
    }
}
