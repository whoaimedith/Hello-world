package edu.tust;

public class PrimeImpl implements Runnable {
   private int maxNum;
    private int count=0;

    public PrimeImpl() {

    }

    public PrimeImpl(int maxNum) {
        this.maxNum = maxNum;
    }
    public boolean isPrime (int Num){
        for(int i=2;i<Num;i++){
            if (Num%i==0){
//                System.out.println(maxNum+"不是素数");
                return false;//返回0表示该数不是素数；
            }


        }
//        System.out.println(maxNum+"是素数");
        return true;//返回1表示该数字是素数
    }
@Override
    public   void run(){
    synchronized(this){
    System.out.println(Thread.currentThread().getName()+"2到"+maxNum+"之间所有的素数是：");
        for(int i=2;i<this.maxNum;i++){
            if(this.isPrime(i)){

                System.out.println(Thread.currentThread().getName()+"=>"+i);
                count++;
            }
        }


        System.out.println(Thread.currentThread().getName()+":END,素数总计："+count);
}
}}