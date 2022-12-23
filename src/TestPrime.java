import edu.tust.PrimeImpl;

import static java.lang.Thread.*;

public class TestPrime {
    public static void main(String[] args) {
        PrimeImpl primeImpl=new PrimeImpl(10);
       Thread a1=new Thread(primeImpl,"线程一");
        Thread a2=new Thread(primeImpl,"线程二");
       Thread a3=new Thread(primeImpl,"线程三");
        Thread a4=new Thread(new PrimeImpl(10),"线程四");
        Thread a5=new Thread(new PrimeImpl(10),"线程五");
        Thread a6=new Thread(new PrimeImpl(10),"线程六");
        a1.setPriority(MIN_PRIORITY);
        a2.setPriority(NORM_PRIORITY);
        a3.setPriority(MAX_PRIORITY);
        a4.setPriority(MIN_PRIORITY);
        a5.setPriority(NORM_PRIORITY);
        a6.setPriority(MAX_PRIORITY);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
        a6.start();



    }
}