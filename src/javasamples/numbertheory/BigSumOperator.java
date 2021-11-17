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
          int [] result=  new int[len+1];

          Arrays.fill(number1,0);
          Arrays.fill(number2,0);

          for(int i=a.length()-1; i>=0; i--)   number1[i]= Character.getNumericValue(a.charAt(i));

          for(int j=b.length()-1; j>=0; j--)   number2[j]= Character.getNumericValue(b.charAt(j));

          for(int k=a.length()-1;k>=0;k--){
              int index=number1[k]+number2[k];
              int divide = index/10;
              int remainder= index %10;
              result[k+1]=remainder;
              if(k-1 == -1)
                  result[k+1] += divide;
              else number1[k-1] += divide;
          }

          System.out.print("Number1 = ");
          for(int k=0; k<number1.length;k++)    System.out.print(number1[k] + " ");

          System.out.print("\nNumber2 = ");
          for(int k=0;k<number2.length; k++)   System.out.print( number2[k]+" ");

         System.out.print("\nSum of Number1 and Number2 is = ");
         for(int k=0;k<result.length;k++) System.out.print(result[k] + " ");



            return sum;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //String a = scanner.nextLine();
       // String b= scanner.nextLine();
        String a="876576230976999997867566587687687686787686786786786787686786786787683435443534534543543453453453458";
        String b ="977666789789798797979797979797987987987900789934535434534534553400000000099999999999999999988888888768676";
        String sum="";
        sum = getBigSum(a,b);

    }
}
