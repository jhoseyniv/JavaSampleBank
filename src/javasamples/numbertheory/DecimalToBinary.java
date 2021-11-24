package javasamples.numbertheory;


public class DecimalToBinary {
    public static void main(String args[]){
        long a=1 ;

        String binary=Long.toBinaryString(a);
        if(binary.length()<32) {
            for (int i =  binary.length(); i < 32 ; i++)
                binary = "0" + binary;
        }
        StringBuilder stringBuilder= new StringBuilder(binary);
        System.out.println("Binary form of "+ a + " is =" +stringBuilder);

        for(int i=0;i<stringBuilder.length();i++)
            if(stringBuilder.charAt(i)=='0') stringBuilder.setCharAt(i,'1');
            else stringBuilder.setCharAt(i,'0');
        System.out.println("Flipping bits Binary form of "+ a + " is =" +stringBuilder);
        System.out.println("Decimal  is =" +Long.parseLong(stringBuilder.toString(),2));
    }
}
