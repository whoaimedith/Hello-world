package com.baidu;

public class ThreadSynTest {
    public static void main(String[] args){
        BankAccount bankAccount=new BankAccount(200);
        WithdrawalThread w1=new WithdrawalThread(bankAccount);
        Thread t1=new Thread(w1);
        Thread t2=new Thread(w1);
        Thread t3=new Thread(w1);
        t1.setName("账户A");
        t2.setName("账户B");
        t3.setName("账户C");
        t1.start();
        t2.start();
        t3.start();



    }
}
