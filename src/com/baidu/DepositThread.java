package com.baidu;
//存款线程体
public class DepositThread implements Runnable {
    private BankAccount bankAccount;
    public DepositThread(){
        this.bankAccount=new BankAccount();
    }
    public DepositThread(BankAccount bankAccount){
       this.bankAccount=bankAccount;
    }
    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()) {
            bankAccount.addmoney(100);//存钱线程体，原子性
        }
    }
}
