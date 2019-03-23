package com.homework;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    LinkedList<String> list;


    @Before
    public void setUp() throws Exception {
        list = new LinkedList<String>();
        list.add("First Node");
        list.add("Second Node");
    }

    @Test
    public void add() {
        list.add("Third Node");
        assertEquals("Third Node", list.get(2));
    }

    @Test
    public void size() {
        assertEquals(2, list.size());
    }

    @Test
    public void remove() {
        list.remove(0);
        assertEquals("Second Node", list.get(0));
    }

    @Test
    public void clear() {
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void get() {
        assertEquals("Second Node", list.get(1));
    }

}
