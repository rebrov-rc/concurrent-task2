package com.concurrenttask2.concurrentclasses;

public class MyThread extends Thread{

    public MyThread(){}
    public MyThread(String name){super(name);}
    public MyThread(ThreadGroup group, String name){super(group, name);}

    @Override
    public void run() {

        try {
            while (!this.isInterrupted()) {
                Thread.sleep(3000);
                System.out.println(this.getName() + " Всем привет!");
            }
        }catch (InterruptedException ex){

        }finally{
            System.out.printf("%s Процесс завершён\n", this.getName());
        }
    }
}
