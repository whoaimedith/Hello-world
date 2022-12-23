package edu.tust;

public class PrimeGenerator extends Thread
{
    private  long aLong=Long.MAX_VALUE;
    private  long count=0;
    public PrimeGenerator(){


    }
    public PrimeGenerator(String name){
        super(name);
    }

 public boolean isPrinme(int m){
        for(int i=2;i<m;i++){
            if(m%i==0){

                return false;

            }

        }
        return true;
        }
        public void run(){
        for(int i=2;i<this.aLong;i++){
            if(this.isPrinme(i)){
                System.out.println(Thread.currentThread().getName()+"=>"+i);
                count++;
//                if(this.isInterrupted()){
//                    System.out.println("子线程被中断，子线程结束");
//                    return;
//                }
                try {
                    Thread.sleep(600);
                }catch (InterruptedException e){
                    System.out.println("子线程休眠时检测到中断，抛出异常，异常被捕获，处理方式为结束子线程");
                    return;
                }
            }

        }

        }


}
