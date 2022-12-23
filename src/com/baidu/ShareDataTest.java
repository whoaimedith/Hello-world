package com.baidu;

public class ShareDataTest {
    public static void main(String[] args) {
        TicketImp ticketImp = new TicketImp();
        Thread t1 = new Thread(ticketImp, "窗口A");
        Thread t2 = new Thread(ticketImp, "窗口B");
        Thread t3 = new Thread(ticketImp, "窗口C");
        t1.start();
        t2.start();
        t3.start();

    }
}