package javasamples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class SparsMatrix {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<queries.size();i++){
            result.add(i,0);
            for(int j=0;j<strings.size();j++){
                if(queries.get(i).equalsIgnoreCase(strings.get(j)))
                    result.set(i,result.get(i)+1);
            }

        }
        return result;
    }

    public static void main(String args[]){
        List<Integer> result = new ArrayList<Integer>();
        List<String> strings = new ArrayList<String>(Arrays.asList( "aba" , "baba", "aba", "xzxb") );
        List<String> queries = new ArrayList<String>(Arrays.asList("aba","xzxb","ab"));


        result = matchingStrings(strings, queries);
    }
}
