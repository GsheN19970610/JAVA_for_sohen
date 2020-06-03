package Day_7;

public class PrimeFinder2 implements Runnable{
    public long target;
    public long prime;
    public boolean finished = false;
    private Thread runner;

    class NegativeNumberException extends Exception{                        //加入的负数判断
        NegativeNumberException(){
            super();
        }
        NegativeNumberException(String message){
            super(message);
        }
    }

    PrimeFinder2(long inTarget) throws NegativeNumberException{
        if(inTarget<0){                                                     //当目标小于0的时候报错
            NegativeNumberException negativeNumberException = new NegativeNumberException(
                    "Negative numers not allowed: " +inTarget);
            throw negativeNumberException;                                  //throw抛出异常
        }
        target = inTarget;
        if(runner == null){
            runner = new Thread(this);
            runner.start();
        }
    }



    boolean isPrime(long checkNumber){          //是否为质数
        double root = Math.sqrt(checkNumber);   //开平方
        for (int i = 2; i <= root ; i++)
        {
            if(checkNumber % i == 0)            //若有一个大于2且小于等于他的平方根的数被整除
                return false;                   //就不是质数了
        }
        return true;
    }

    public void run() {                     //runnable 接口有且只有一个方法run
        long numPrimes = 0;
        long candidate = 2;
        while (numPrimes < target){         //目标为找到target个素数
            if(isPrime(candidate)){
                numPrimes++;
                prime = candidate;          //找到素数
            }
            candidate++;                    //找不到就candidate+1，找到为止
        }
        finished = true;
    }
}
