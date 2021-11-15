package javasamples.String2021;
//A palindrome is a word, phrase, number, or other sequence of characters which reads the
// the same backward or forward.
public class JavaStringReverse {
    public static void main(String args[]){
        String st="rmadsydamr";
        boolean isrev=true;
        for (int i=0; i<st.length()/2;i++){
            if(st.charAt(i) != st.charAt(st.length()-i-1)){
                isrev =false;
            }
        }
        System.out.println("is " +isrev );
    }
}
