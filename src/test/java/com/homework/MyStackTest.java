package com.homework;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class MyStackTest {

    Stack<String> stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack<String>();
        stack.push("First item");
        stack.push("Second item");
    }

    @Test
    public void push() {
        stack.push("Third item");
        assertEquals("Third item", stack.get(2));
    }

    @Test
    public void remove() {
        String i = stack.remove(1);
        assertEquals("Second item", i);
    }

    @Test
    public void clear() {
        stack.clear();
        assertEquals(0, stack.size());
    }

    @Test
    public void size() {
        assertEquals(2, stack.size());
    }

    @Test
    public void peek() {
        assertEquals("Second item", stack.peek());
    }

    @Test
    public void pop() {
        assertEquals("Second item", stack.pop());
    }

}
