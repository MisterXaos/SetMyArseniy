import org.example.SetDifferenceCalculator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest4 {
    SetDifferenceCalculator setDifferenceCalculator = new SetDifferenceCalculator();

    @Test
    public void calculateDifference_intersection_one(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5,6,7,8,9));

        Set<Integer> set_correct = new HashSet<>(Arrays.asList(1,2,3,4));

        Set<Integer> set_res = setDifferenceCalculator.calculateDifference(set1, set2);

        assertEquals(set_correct, set_res);
    }
    @Test
    public void calculateDifference_intersection_null(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList());
        Set<Integer> set2 = new HashSet<>(Arrays.asList());


        Set<Integer> set_correct = new HashSet<>(Arrays.asList());

        Set<Integer> set_res = setDifferenceCalculator.calculateDifference(set1, set2);

        assertEquals(set_correct, set_res);
    }
    @Test
    public void calculateDifference_intersection_all(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4,5));

        Set<Integer> set_correct = new HashSet<>(Arrays.asList());

        Set<Integer> set_res = setDifferenceCalculator.calculateDifference(set1, set2);

        assertEquals(set_correct, set_res);
    }
    @Test
    public void calculateDifference_intersection_no(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6,7,8,9));

        Set<Integer> set_correct = new HashSet<>(Arrays.asList(1,2,3,4,5));

        Set<Integer> set_res = setDifferenceCalculator.calculateDifference(set1, set2);

        assertEquals(set_correct, set_res);
    }

    @Test
    public void calculateDifference_intersection_negative(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(-1,-2));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2));

        Set<Integer> set_correct = new HashSet<>(Arrays.asList(-1,-2));

        Set<Integer> set_res = setDifferenceCalculator.calculateDifference(set1, set2);

        assertEquals(set_correct, set_res);
    }

}
