package Day_7;

public class PrimeThreads {
    public static void main(String[] arguments) {
        PrimeThreads pt = new PrimeThreads(arguments);
    }

    public PrimeThreads(String[] args){
        PrimeFinder[]  finder = new PrimeFinder[args.length];
        for (int i = 0; i < args.length ; i++){
            try {
                long count = Long.parseLong(args[i]);
                finder[i] = new PrimeFinder(count);
                System.out.println("Longing for prime "+ count);                //要找count个素数
            }catch (NumberFormatException numberFormatException){
                System.out.println("Error: " + numberFormatException.getMessage());
            }
        }
        boolean complete = false;
        while (!complete){
            complete = true;
            for(int j = 0;j < finder.length ; j++){
                if(finder[j] == null) continue;
                if (!finder[j].finished){
                    complete = false;
                }else {
                    displayResult(finder[j]);
                    finder[j] = null;
                }
            }try {
                Thread.sleep(1000);
            }catch (InterruptedException ie){}
        }
    }

    private void displayResult(PrimeFinder finder){
        System.out.println("Prime " + finder.target
             + " is " + finder.prime);
    }
}
