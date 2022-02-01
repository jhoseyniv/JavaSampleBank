package javasamples.sort;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BigSortByComareator {

  public static Comparator<String> myComparetor= new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
          return o1.compareTo(o2);
      }
  };

    public static void main(String args[]){
        List<String> unsorted= new ArrayList<>(
                Arrays.asList("6","31415926535897932384626433832795","1","3","10","3","5")
        );

        int max = unsorted.stream().map(String::length).max(Integer::compareTo).get();


        for (int i=0;i<unsorted.size();i++){
            int len=unsorted.get(i).length();
           if( len <max) {
               String formmater= String.format("%0"+(max-len)+"d%s",0,unsorted.get(i));
               unsorted.set(i,formmater );
           }
         }
        unsorted.sort(myComparetor);
        for(int i=0;i<unsorted.size();i++)
           unsorted.set(i ,unsorted.get(i).replaceFirst ("^0*", ""));


    }
}
