import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommonElementsInTwoListsTest {
    @Test
    void commonElements(){

         List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(5);
        list2.add(3);
        list2.add(4);

        List<Integer> Expected = new ArrayList<>(List.of(3,4));




        assertEquals(Expected,CommonElementsInTwoLists.findingCommonElements(list1,list2));
    }

}