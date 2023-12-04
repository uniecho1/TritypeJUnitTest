package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
//    选择的 decision 为 Side1+Side2 <= Side3 || Side2+Side3 <= Side1 || Side1+Side3 <= Side2
    @Test
    public void TestMCDC(){
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 3));
        assertEquals(4, tri.Triang(3, 2, 1));
        assertEquals(4, tri.Triang(1, 3, 2));
        assertEquals(1, tri.Triang(3, 4, 5));
    }
}