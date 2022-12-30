package javasamples.LinkList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotationTestUnit {


    @Test
    public void leftRotateList(){
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> shiftedZeroLeft=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> shiftedOneLeft=new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7,8,9,10,1));
        List<Integer> shiftedOne9=new ArrayList<Integer>(Arrays.asList(10,1,2,3,4,5,6,7,8,9));
        List<Integer> shiftedOne10=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        assertArrayEquals(LeftRotation.rotatLeft(0,list).toArray(),shiftedZeroLeft.toArray());
        assertArrayEquals(LeftRotation.rotatLeft(1,list).toArray(),shiftedOneLeft.toArray());
        assertArrayEquals(LeftRotation.rotatLeft(9,list).toArray(),shiftedOne9.toArray());
        assertArrayEquals(LeftRotation.rotatLeft(10,list).toArray(),shiftedOne10.toArray());
    }
}
