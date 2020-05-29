package Day_5;

public class BigValue {
    float result;

    public BigValue(int a ,int b){
        result = calculateResult(a,b);
    }

    float calculateResult(int a, int b){
        return (a * 10) + (b * 2);
    }

    public static void main(String[] args) {
        BiggerValue bgr = new BiggerValue(2,3,4);
        System.out.println("The result is " + bgr.result);
    }
}

class BiggerValue extends BigValue{
        BiggerValue(int a,int b,int c){
            super(a,b);
            result = calculateResult(a,b,c);
        }

    float calculateResult(int a, int b,int c) {
        return (c*3)*result;
    }
}

