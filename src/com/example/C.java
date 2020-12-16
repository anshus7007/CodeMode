package com.example;

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("From Thread C: k= " + k);
            if (k == 1)
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                }
        }
        System.out.println("Exit from C");
    }
}
