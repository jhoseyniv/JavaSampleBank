package javasamples.graphicsamples1;



import java.util.*;

public class InternationalizationDemo {
    public static void main(String[] args) {
        String language;
        String country;
        Locale locale;
        ResourceBundle rb;

        if (args.length != 2) {
            language = new String("fa");
            country = new String("IR");
        }
        else {
            language = new String(args[0]);
            country = new String(args[1]);
        }
         locale = new Locale(language, country);
         rb = ResourceBundle.getBundle("MessagesBundle", locale);
         System.out.println(rb.getString("localeInfo") + " ( " + 
locale.getDisplayLanguage() + "," + locale.getDisplayCountry() + ").\n");
         System.out.println(rb.getString("welcome"));
         System.out.println(rb.getString("sayThanks"));
    }
}
