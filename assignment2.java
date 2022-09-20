import java.util.Scanner;

class negativeNumber extends Exception{
    public String toString(){
        return "entered number is negative";
    }
}

class numberNotPrime extends Exception{
    int n;
    numberNotPrime(int n){
        this.n = n;
    }
    public String toString(){
        return n+" is not prime";
    }
}

public class assignment2 {
    static void checkPrime(int n){
        if(n==0 || n==1){
            System.out.println(n + " is neither prime nor composite");
        }
        else{
            int i = 2;
            while(i!=((n/2)+1)){
                if(n%i == 0)
                    break;
                i++;
            }
            try{
                if(i==((n/2)+1))
                    System.out.println(n+" is prime");
                else
                    throw new numberNotPrime(n);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("enter a number to check if it's prime");
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        try{
            if(n<0)
                throw new negativeNumber();
            else
                checkPrime(n);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
