import org.example.SetIntersectionChecker;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleTest2 {

    @Test
    public void testUniqueNumberExtractor_intersection_negative(){
        SetIntersectionChecker extarctor = new SetIntersectionChecker();
        Set<Integer> num1 = new HashSet<>(Arrays.asList(-1,-2));
        Set<Integer> num2 = new HashSet<>(Arrays.asList(1,2));

        assertFalse(extarctor.isIntersecting(num1, num2),"Всё не гуд");
    }

    @Test
    public void testUniqueNumberExtractor_intersection_more_ore_one(){
        SetIntersectionChecker extarctor = new SetIntersectionChecker();
        Set<Integer> num1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> num2 = new HashSet<>(Arrays.asList(5,6,7,8,4));

        assertTrue(extarctor.isIntersecting(num1, num2),"Всё не гуд");
    }

    @Test
    public void testUniqueNumberExtractor_intersection_null(){
        SetIntersectionChecker extarctor = new SetIntersectionChecker();
        Set<Integer> num1 = new HashSet<>(Arrays.asList());
        Set<Integer> num2 = new HashSet<>(Arrays.asList());

        assertTrue(extarctor.isIntersecting(num1, num2),"Всё не гуд");
    }

    @Test
    public void testUniqueNumberExtractor_intersection_all_duplicate(){
        SetIntersectionChecker extarctor = new SetIntersectionChecker();
        Set<Integer> num1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> num2 = new HashSet<>(Arrays.asList(1,2,3,4,5));

        assertTrue(extarctor.isIntersecting(num1, num2),"Всё не гуд");
    }

    @Test
    public void testUniqueNumberExtractor_intersection_one_subset_of_another(){
        SetIntersectionChecker extarctor = new SetIntersectionChecker();
        Set<Integer> num1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> num2 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8));

        assertTrue(extarctor.isIntersecting(num1, num2),"Всё не гуд");
    }

    @Test
    public void testUniqueNumberExtractor_no_intersection(){
        SetIntersectionChecker extarctor = new SetIntersectionChecker();
        Set<Integer> num1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> num2 = new HashSet<>(Arrays.asList(6,7,8));

        assertFalse(extarctor.isIntersecting(num1, num2),"Всё не гуд");
    }

}
