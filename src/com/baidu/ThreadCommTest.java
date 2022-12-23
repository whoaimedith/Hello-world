package com.baidu;

public class ThreadCommTest {
    public static void main(String[] args){
        BankAccount bankAccount=new BankAccount();
        DepositThread d1=new DepositThread(bankAccount);
        WithdrawalThread w1=new WithdrawalThread(bankAccount);
        Thread t1=new Thread(d1,"存钱客户A");
        Thread t2=new Thread(w1,"取钱客户B");
        Thread t3=new Thread(w1,"取钱客户C");
        Thread t4=new Thread(d1,"存钱客户D");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            Thread.sleep(30);
        }catch (InterruptedException e){
            System.out.println(e.toString());
        }
        t1.interrupt();
        t3.interrupt();
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println(e.toString());
        }
        t2.interrupt();
        t4.interrupt();


    }
}
