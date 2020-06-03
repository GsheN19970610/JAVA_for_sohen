package Day_7;

public class PrimeThreads2 {
    public static void main(String[] arguments) {
        try{
            PrimeFinder2[] finder = new PrimeFinder2[arguments.length];
            for (int i = 0; i<arguments.length ; i++){
                long count = Long.parseLong(arguments[i]);
                finder[i] = new PrimeFinder2(count);
                System.out.println("Looking for prime " + count);
            }
            boolean complete = false;
            while (!complete){
                complete = true;
                for (int j = 0;j< finder.length;j++){
                    if (!finder[j].finished){
                        complete = false;}
                }
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException ie){
                    //
                }
            }
            for (int j = 0 ; j< finder.length ; j++){
                System.out.println("Prime " + finder[j].target + "is " + finder[j].prime);
            }
        }catch (NumberFormatException numberFormatException){
            System.out.println("Error: " + numberFormatException.getMessage());
        }catch (PrimeFinder2.NegativeNumberException negativeNumberException){
            System.out.println("Error:  " + negativeNumberException.getMessage());
        }
    }
}
