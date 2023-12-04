package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3, 4, 5));
        assertEquals(2, tri.Triang(3, 3, 1));
        assertEquals(2, tri.Triang(3, 1, 3));
        assertEquals(2, tri.Triang(1, 3, 3));
        assertEquals(3, tri.Triang(3, 3, 3));
        assertEquals(4, tri.Triang(1, 1, 4));
        assertEquals(4, tri.Triang(-1, -1, -1));
        assertEquals(4, tri.Triang(1, 2, 7));

    }
}