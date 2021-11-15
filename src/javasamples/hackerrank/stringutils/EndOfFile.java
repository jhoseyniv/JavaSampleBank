package javasamples.hackerrank.stringutils;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        String eof="end-of-file.";
        int counter=0;
        boolean countinueReadFromFile=true;
        while(countinueReadFromFile){
                String lineOfFile = scanner.nextLine();
            counter++;
            System.out.println(counter +" "+ lineOfFile);
            if(lineOfFile!=null) {
                int index = lineOfFile.indexOf(eof);
                if (index >= 0 && index + eof.length() == lineOfFile.length()) countinueReadFromFile = false;
            }
        }
    }
}
