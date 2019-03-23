package com.homework;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MyArrayListTest {
    ArrayList arrayList;

    @Before
    public void setUp() {
        arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
    }

    @Test
    public void add() {
        arrayList.add(3);
        arrayList.add(4);

        assertEquals(3, arrayList.get(2));
        assertEquals(4, arrayList.get(3));
    }

    @Test
    public void remove() {
        arrayList.remove(1);
        assertEquals(1, arrayList.get(0));
    }

    @Test
    public void clear() {
        arrayList.clear();
        assertEquals(0, arrayList.size());
    }

    @Test
    public void size() {
        assertEquals(2, arrayList.size());
    }

    @Test
    public void get() {
        assertEquals(1, arrayList.get(0));
    }

}