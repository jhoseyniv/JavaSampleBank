package javasamples.numbertheory;

public class DecimalToBinary {
    public static void main(String args[]){
        int a=247777;
        String binary=Integer.toBinaryString(a);
        System.out.println("Binary form of "+ a + " is =" +binary);

        for(int i=0;i<binary.length();i++)
            if(binary.charAt(i)=='0') binary.replace('0','1');
            else binary.replace('1','0');

        System.out.println("Flipping bits Binary form of "+ a + " is =" +binary);
    }
}
