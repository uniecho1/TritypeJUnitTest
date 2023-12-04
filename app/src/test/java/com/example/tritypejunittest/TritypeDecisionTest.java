package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeDecisionTest {
//    选择的 decision 为 Side1+Side2 <= Side3 || Side2+Side3 <= Side1 || Side1+Side3 <= Side2
    @Test
    public void TestDecision(){
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 3));
        assertEquals(1, tri.Triang(3, 4, 5));
    }
}