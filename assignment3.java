import java.util.Scanner;

class stringNotPresent extends Exception{
    public String toString(){
        return "String not present";
    }
}

public class assignment3 {
    public static void main(String[] args){
        String s;
        String s1 = new String("SDMCET");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter something");
        s = sc.nextLine();
        sc.close();
        int i = 0,j = 6;
        int a = s.length();
        int b = s.length()-6;
        while(i<=b && j<=s.length() && b>=0){
            if(s1.equalsIgnoreCase(s.substring(i,j)) || s1.equalsIgnoreCase(s.substring(b,a))){
                System.out.println("String is present");
                return ;
            }
            i++;j++;b--;a--;
        }
        try{
            throw new stringNotPresent();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
