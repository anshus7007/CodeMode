package com.example;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1)
                yield();
            System.out.println("From Thread A: i= " + i);
        }
        System.out.println("Exit from A");
    }
}
