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
                Arrays.asList("98765438877876868678678678678210","00000000001","00000000003","00000000010","00000000003","00000000005","3084193741")
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

    }
}
