import edu.tust.PrimeThread;

public class TestPrimeThread {
    public static void main(String[] args){
    PrimeThread primeThread1 =new PrimeThread(10);
    PrimeThread primeThread2 =new PrimeThread(10);
    primeThread1.start();
        primeThread2.start();
}}
