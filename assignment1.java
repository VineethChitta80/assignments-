class assignment1{
    public static void main(String[] args){
        int a = 0,b = 10;
        int[] c = new int[1];
        String s = new String("JAVA");
        try{
            b = b / a;
        }catch(ArithmeticException e){
            System.out.println("Arithmatic exception");
        }finally{
            a = 2;
            System.out.print("Arithmatic exception is handled and " +0+ " is converted to 2\n");
            System.out.println("The division is "+b);
        }

        try{
            System.out.println(s.charAt(s.length()));
        }catch(StringIndexOutOfBoundsException e1){
            System.out.println("String index out of bounds exception");
        }finally{
            System.out.println("String index out of bounds exception is handled");
            System.out.println("The last element of string is "+ s.charAt(s.length()-1));
        }

        try{
            c[1] = 1;
            System.out.println(c.length);
        }catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Array index out of bounds exception");
        }finally{
            c = new int[2];
            c[1] = 1;
            System.out.println("c["+(c.length-1)+"] = " + c[1]);
        }
    }
}