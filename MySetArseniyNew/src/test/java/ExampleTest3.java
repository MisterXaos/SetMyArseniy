import org.example.SetMerger;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest3 {
    SetMerger setMerger = new SetMerger();

    @Test
    public void mergeSets_intersection_one(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5,6,7,8,9));

        Set<Integer> set_correct = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Set<Integer> set_all = setMerger.mergeSets(set1, set2);

        assertEquals(set_correct, set_all);
    }

    @Test
    public void mergeSets_intersection_alls(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4,5));

        Set<Integer> set_correct = new HashSet<>(Arrays.asList(1,2,3,4,5));

        Set<Integer> set_all = setMerger.mergeSets(set1, set2);

        assertEquals(set_correct, set_all);
    }

    @Test
    public void mergeSets_intersection_Duplicat(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(7,8,9));

        Set<Integer> set_correct = new HashSet<>(Arrays.asList(1,2,3,4,5,7,8,9));

        Set<Integer> set_all = setMerger.mergeSets(set1, set2);

        assertEquals(set_correct, set_all);
    }

    @Test
    public void mergeSets_intersection_null(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList());
        Set<Integer> set2 = new HashSet<>(Arrays.asList());

        Set<Integer> set_correct = new HashSet<>(Arrays.asList());

        Set<Integer> set_all = setMerger.mergeSets(set1, set2);

        assertEquals(set_correct, set_all);
    }

    @Test
    public void mergeSets_intersection_negative(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(-1,-2));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2));

        Set<Integer> set_correct = new HashSet<>(Arrays.asList(-2,-1,1,2));

        Set<Integer> set_all = setMerger.mergeSets(set1, set2);

        assertEquals(set_correct, set_all);
    }
}
