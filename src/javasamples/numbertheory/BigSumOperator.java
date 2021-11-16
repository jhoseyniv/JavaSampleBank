package javasamples.numbertheory;

import java.util.Arrays;
import java.util.Scanner;

public class BigSumOperator {


    public static String getBigSum(String a , String b){
          String sum="0";
        int lenNumber1=a.length();
        int lenNumber2=b.length();
        int len=0;
          if( lenNumber1 < lenNumber2) {
              for(int i=0; i< lenNumber2 - lenNumber1;i++)   a = "0" +a;
          }else {
              for(int i=0; i< lenNumber1 -lenNumber2;i++)   b = "0" +b;
          }

           len = a.length();
          int [] number1= new int[len];
          int [] number2= new int[len];
          int owerFlow;
          Arrays.fill(number1,0);
          Arrays.fill(number2,0);

        for(int i=a.length()-1; i>=0; i--)
              number1[i]= Character.getNumericValue(a.charAt(i));

        for(int j=b.length()-1; j>=0; j--)
            number2[j]= Character.getNumericValue(b.charAt(j));

        System.out.print("Number1 = ");
        for(int k=0; k<number1.length;k++){
            System.out.print(number1[k] + " ");
        }

        System.out.print("\nNumber2 = ");

        for(int k=0;k<number2.length; k++) {
            System.out.print( number2[k]+" ");
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //String a = scanner.nextLine();
       // String b= scanner.nextLine();
        String a="87657623090000975657364756565656656565665656546635353535535";
        String b ="33409059600000";
        String sum="";
        sum = getBigSum(a,b);

    }
}
