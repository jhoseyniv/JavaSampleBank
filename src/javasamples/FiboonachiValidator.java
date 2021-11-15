package javasamples;

public class FiboonachiValidator {

   public static long[] getFiboSeri(int n){
       long[] series= new long[n];
       series[0]=0;
       series[1]=1;
       for (int i=2;i<n;i++) {
           series[i] = series[i-1] + series[i-2];
           System.out.println(series[i]);
       }
       return series;
   }

    public static boolean  isFibonacci(long fibo){
        boolean flag=true;
        boolean isFiboo=false;
       long pervious=0;
       long current=1;
       long next = 1;

        while(flag){
            next =current + pervious;
            System.out.println("next = "+ next);
            if(next==fibo) {
                isFiboo=true;
                flag = false;
            }else if(next > fibo) {
                isFiboo=false;
                flag = false;
            }
            pervious = current;
            current = next;
        }
       return isFiboo;
    }
    public static boolean isFibooByEquation(long n){
       boolean result=false;
       double X1 = 5 * Math.pow(n, 2) + 4;
        double X2 = 5 * Math.pow(n, 2) - 4;

        long X1_sqrt = (long)Math.sqrt(X1);
        long X2_sqrt = (long)Math.sqrt(X2);
        if(X1_sqrt * X1_sqrt == X1 || X2_sqrt*X2_sqrt==X2) {
            System.out.println(n + " IS A fibonacci number based on equation n^4+2 ");
            result =true;
        }else{
            System.out.println(n + " is NOT fibonacci number based on equation n^4+2 ");
            result =false;
        }
        return result;
    }
    public static void main(String args[]){
        long fibo1=144L;
        long fibo2=1836311903L;
        long fibo3=267914296L;
        long fibo4=145L;


            //print fibonacci number by DP
            // long[] a=getFiboSeri(50);
        boolean bool=isFibonacci(fibo1);
        boolean bool2=isFibonacci(fibo2);

         System.out.println(fibo1 + " is  a fibo number =" + bool);
        System.out.println(fibo2 + " is  a fibo number =" + bool2);
      //  System.out.println(fibo3 + " is  a fibo number =" + bool3);




        boolean a =isFibooByEquation(fibo1);
        boolean b =isFibooByEquation(fibo3);
        boolean c =isFibooByEquation(fibo4);



    }
}
