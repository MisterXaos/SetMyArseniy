import org.example.UniqueNumberExtractor;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest1 {
    private final UniqueNumberExtractor uniqueNumberExtractor = new UniqueNumberExtractor();

    @Test
    public void testUniqueNumberExtractor_Duplicat(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1,2,2,3,4,4,5);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers,actualUniqueNumbers, "Дубликаты удалены");
    }

    @Test
    public void testUniqueNumberExtractor_Null(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList();

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList());
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers,actualUniqueNumbers,
                "Пустой");
    }

    @Test
    public void testUniqueNumberExtractor_No_Duplicates(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers,actualUniqueNumbers,
                "Дубликаты так и были");
    }

    @Test
    public void testUniqueNumberExtractor_Negativ_Duplicates(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(-1,-2,-2,-3,-4,-5,-3);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(-1,-2,-3,-4,-5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers,actualUniqueNumbers,
                "Дубликаты удалены");
    }

    @Test
    public void testUniqueNumberExtractor_All_Duplicates(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1,1,1,1);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers,actualUniqueNumbers,
                "Дубликаты удалены");
    }

}
