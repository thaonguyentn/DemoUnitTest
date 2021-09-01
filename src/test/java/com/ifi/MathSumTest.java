package com.ifi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MathSumTest {
    MathSum mathsum = new MathSum();
    @Test
    void test1(){
        assertEquals(mathsum.sum(1,1),2);
    }
    @Test
    void test2(){
        assertEquals(mathsum.sum(1,2),3);
    }
    @Test
    void test3(){
        assertEquals(mathsum.sum(1,3),4);
    }
}
