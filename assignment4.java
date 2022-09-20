import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class VowelNotAllowed extends Exception{
    //do nothing
}

public class assignment4 {
    public static void main(String[] args){
        try{
            int ch,n;
            char c;
            FileOutputStream fs = new FileOutputStream("Alphabets.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of characters to be read");
            n = sc.nextInt();
            for(int i=0;i<n;i++){
                c = sc.next().charAt(0);
                fs.write(c);
            }
            fs.close();
            sc.close();
            FileInputStream fp = new FileInputStream("Alphabets.txt");
            FileOutputStream fa = new FileOutputStream("Consonants.txt");
            while((ch = fp.read()) != -1){
                c = (char)ch;
                try{
                    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                        throw new VowelNotAllowed();
                    }
                    else{
                        fa.write(c);
                    }
                }catch(Exception e){
                    //do nothing
                }
            }
            fa.close();
            fp.close();
        }catch(Exception e){
            System.out.println("file not found");
        }
    }
}
