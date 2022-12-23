package com.baidu;

public class TicketThread extends Thread{
    private int count;
    public  TicketThread(){
        this.count=10;
    }
    public  TicketThread(String name){
        super(name);
        this.count=10;
    }
    public  TicketThread(int count){
        this.count=count;
    }
    public  TicketThread(int count,String name){
        super(name);
        this.count=count;

    }
    @Override
    public synchronized void run(){
        System.out.println(Thread.currentThread().getName()+"卖出票号："+count);
        count--;
    }
}
