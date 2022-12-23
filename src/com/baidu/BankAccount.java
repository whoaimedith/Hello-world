package com.baidu;

public class BankAccount {
    private int balance;//余额
    public BankAccount(){
           this.balance=0;
    }
    public BankAccount(int count){
        this.balance=count;
    }
    public  void getmoney(int lose){

            synchronized (this) {
                if (this.balance >= lose) {
                    this.balance = this.balance - lose;
                    System.out.println(Thread.currentThread().getName() + "成功取款" + lose + "元");
                    this.notifyAll();
                    try {
                        this.wait();
                    }
                    catch (InterruptedException e){
                        System.out.println("等待存款期间检测到异常，结束取款程序");
                      return;
                    }




                } else {
                    System.out.println("账户余额不足，取款失败。等待存款");


                    try {
                        this.wait();

                    }catch (InterruptedException e){
                        System.out.println("等待存款期间检测到异常，结束取款程序");
                        return ;
                    }
                }
            }
        }


    public synchronized void addmoney(int add){
        if(this.balance>=100){
            System.out.println("账户余额达到上限，等待取款");
            try{
                this.wait();
            }catch (InterruptedException e){
                System.out.println("等待取款期间检测到异常，结束取款程序");
            }
        }
        else {
            this.balance = this.balance + add;
            System.out.println(Thread.currentThread().getName() + "存款" + add + "元");
            this.notifyAll();
            try{
                this.wait();
            }catch (InterruptedException e)
            {
                System.out.println("等待存款期间检测到异常，结束取款程序");
            }
        }

    }
}
