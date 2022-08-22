package com.concurrenttask2;

import com.concurrenttask2.concurrentclasses.MyCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;


public class Main {

    private static int taskNumber = 4;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Создаю потоки...");

        final ExecutorService threadPool = Executors.newFixedThreadPool(4);
        List<Callable<Integer>> callableList = new ArrayList<>();

        int times = 0;
        while(times < taskNumber) {

            callableList.add(new MyCallable(new Random().nextInt(10) + 1));
            times++;
        }
        int result = threadPool.invokeAny(callableList);


        System.out.println(result);


        System.out.println("Завершаю все потоки.");
        threadPool.shutdown();
    }
}