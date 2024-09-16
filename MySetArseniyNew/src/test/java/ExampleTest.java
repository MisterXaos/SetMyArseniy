import org.example.Example;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    static Example example;

    @BeforeAll
    static void secondtest(){
        example = new Example();
        System.out.println("Объект создан");
    }


    @Test
    void test(){
        System.out.println("My first test!");
        assertEquals(5, example.max(4,5));
        assertEquals(-20, example.max(-100,-20));
        assertEquals(34, example.max(34,25));
        assertEquals(0, example.max(0,0));
    }

    @Test
    void sumtest(){
        System.out.println("My secod test!");

        assertEquals(9, example.sum(4,5));
        assertEquals(-120, example.sum(-100,-20));
        assertEquals(59, example.sum(34,25));
        assertEquals(0, example.sum(0,0));
    }

    @AfterAll
    static void showrResult(){
        System.out.println(" Я молодец");
    }
    @BeforeEach
    void checkTest(){
        System.out.println("Начало тестирования");
    }

}
