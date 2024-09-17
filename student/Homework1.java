package student;

public class Homework1 {
    
    public double shippingCalculator(int n){
        double total = 10.95;
        if(n==0){
            return 0;
        }else{
            while(n>1){
                total+=2.95;
                n--;
            }
            return total;
        }
    }
    public boolean isValidTriangle(int a, int b, int c){
        if(a+b<=c){
            return false;
        }else if(b+c<=a){
            return false;
        }else if(a+c<=b){
            return false;
        }else{
            return true;
        }
    }
    public boolean isPrime(int number){
        int n=number;
        for(int i=2; i<number; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public  int hex2int(String hex) {
        //TODO Write your code here for problem 4
        return 0;
    }
    public String int2hex(int value) {
        //TODO Write your code here for problem 4
        return "";
    }


}
