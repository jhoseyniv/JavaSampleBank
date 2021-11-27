package javasamples.security;

public class CaesarCipher {

    public static String doChpher(String text,int k){
        StringBuilder chiperText=new StringBuilder();
        int newChar=-1;
        for(int i=0;i<text.length();i++){
            if( text.charAt(i) <= 'z' && text.charAt(i) >='a') {
                newChar= text.charAt(i) + k % 26;
                if(newChar >'z' ) newChar = newChar - 26 ;
                chiperText.append((char) newChar);
            }else if (text.charAt(i) <= 'Z' && text.charAt(i) >='A') {
                newChar= text.charAt(i) + k % 26;
                if(newChar >'Z' ) newChar = newChar -26 ;
                chiperText.append((char) newChar);
            }
             else{
                 chiperText.append(text.charAt(i));
            }


        }

        System.out.println(chiperText);
        return chiperText.toString();
    }

    public static void main(String[] args){
        String st =doChpher("www.abc.xy",87);

    }
}
