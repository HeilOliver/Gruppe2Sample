package at.fhv.ohe.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {


    @Test
    void something() {
        TestClass testClass = new TestClass(2);

        assertEquals(5, testClass.sum(1,2));
    }

    @Test
    void something2() {
        TestClass testClass = new TestClass(2);

        assertEquals(6, testClass.sum(1,2));
    }

    @Test
    void something3() {
        TestClass testClass = new TestClass(4);

        assertEquals(6, testClass.sum(1,2));
    }

}