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
        switch(hex){
            case "0":
            return 0;
            case "1":
            return 1;
            case "2":
            return 2;
            case "3":
            return 3;
            case "4":
            return 4;
            case "5":
            return 5;
            case "6":
            return 6;
            case "7":
            return 7;
            case "8":
            return 8;
            case "9":
            return 9;
            case "A":
            return 10;
            case "B":
            return 11;
            case "C":
            return 12;
            case "D":
            return 13;
            case "E":
            return 14;
            case "F":
            return 15;
            }
        return -1;
    }
    public String int2hex(int value) {
        switch(value){
            case 0:
            return "0";
            case 1:
            return "1";
            case 2:
            return "2";
            case 3:
            return "3";
            case 4:
            return "4";
            case 5:
            return "5";
            case 6:
            return "6";
            case 7:
            return "7";
            case 8:
            return "8";
            case 9:
            return "9";
            case 10:
            return "A";
            case 11:
            return "B";
            case 12:
            return "C";
            case 13:
            return "D";
            case 14:
            return "E";
            case 15:
            return "F";
        }

        return "-1";
    }


}
