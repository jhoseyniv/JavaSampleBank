package javasamples.others;

import java.util.*;

public class GridChallenge {

    public static String gridChallenge(List<String> grid) {
            String result="YES";
        return result;
    }



    public static void main(String[] args){
        List<String> list=new ArrayList<String>(Arrays.asList("fghij","olmkn","trpqs","ebacd","xywuv"));
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
}
