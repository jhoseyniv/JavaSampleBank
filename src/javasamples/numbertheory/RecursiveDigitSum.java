package javasamples.numbertheory;

public class RecursiveDigitSum {

    public  static String sumDigit(String n) {
        int sum=0;
        for(int i=0;i<n.length();i++) {
            char ch=n.charAt(i);
            sum += Character.getNumericValue(ch);
        }
        return  String.valueOf(sum);
    }
    public  static int superDigit(String n, int k) {
        if(n.length()==1) return Integer.valueOf(n);
        else return  superDigit(sumDigit(n),k-1) ;
    }

    public static void main(String[] args){
        int sum=superDigit("9875",4);
        sumDigit( "9875");
        System.out.println(sum);
    }
}
