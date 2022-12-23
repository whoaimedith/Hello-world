import edu.tust.PrimeGenerator;

public class TestAllPrime {
    public static void main(String[] args){
    PrimeGenerator primeGenerator=new PrimeGenerator("线程一");
    primeGenerator.start();
    System.out.println("主线程休眠10秒");

  try {
      Thread.sleep(10000);

  }catch (InterruptedException e){}
  primeGenerator.interrupt();
        System.out.println("主线程休眠完毕，主线程结束");
}
    }