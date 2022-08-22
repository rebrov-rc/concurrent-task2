package com.concurrenttask2.concurrentclasses;

import java.util.concurrent.Callable;


public class MyCallable implements Callable<Integer> {

    private final int count;

    public MyCallable(int i){
        this.count = i;
    }

    @Override
    public Integer call() throws Exception {

        int resultCounter = 0;


            while (count > resultCounter) {
                System.out.println(Thread.currentThread().getName() + " Всем привет!");
                resultCounter++;
            }


          System.out.printf("%s Процесс завершён\n", Thread.currentThread().getName());

        return resultCounter;
    }
}
