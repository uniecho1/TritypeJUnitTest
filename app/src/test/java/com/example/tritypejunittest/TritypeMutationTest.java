package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void TestMutant1(){
        TritypeMutantOne tri = new TritypeMutantOne();
        assertEquals(1, tri.Triang(3, 3, 4));
    }
    @Test
    public void TestMutant2(){
        TritypeMutantTwo tri = new TritypeMutantTwo();
        assertEquals(4, tri.Triang(2, 2, 4));
    }
}