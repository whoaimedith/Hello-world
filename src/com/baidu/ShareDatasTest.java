package com.baidu;

public class ShareDatasTest {
    public static void main(String[] args){
        TicketThread t1=new TicketThread("窗口A");
        TicketThread t2=new TicketThread("窗口B");
        TicketThread t3=new TicketThread("窗口C");
        t1.start();
        t2.start();
        t3.start();
    }
}
