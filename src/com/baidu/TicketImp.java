package com.baidu;

public class TicketImp implements Runnable{
    private int count;
    public TicketImp(){
        this.count=10;
    }
    public TicketImp(int count){
        this.count=count;
    }
    @Override
    public synchronized void run(){

        System.out.println(Thread.currentThread().getName()+"卖出票号："+count);
        count--;
    }
}
