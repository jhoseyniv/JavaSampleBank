package javasamples.numbertheory;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String args[]){

        Comparator<String> custom= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal a=new BigDecimal(o1);
                BigDecimal b= new BigDecimal(o2);
                return  b.compareTo(a);
            }
        };

        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String[] s= new String[n];

        for(int i=0; i<n;i++){
            s[i] = scanner.next();
        }
        Arrays.sort(s,0,n,custom);

        for(int i=0;i<s.length;i++)
            System.out.print(s[i] + " ");
    }
}
