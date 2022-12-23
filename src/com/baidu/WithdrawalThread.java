package com.baidu;

public class WithdrawalThread implements Runnable {
    private BankAccount bankAccount;
    public WithdrawalThread(){
        this.bankAccount=new BankAccount();
    }
    public WithdrawalThread(BankAccount bankAccount){
        this.bankAccount=bankAccount;

    }
    @Override
    public  void run(){
        while (!Thread.currentThread().isInterrupted()) {

            bankAccount.getmoney(100);
        }
    }
}
