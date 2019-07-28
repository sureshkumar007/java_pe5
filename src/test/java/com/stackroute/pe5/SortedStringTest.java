package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortedStringTest {

    SortedString sortedString;
    @Before
    public void setUp() throws Exception {
        sortedString=new SortedString();
    }

    @After
    public void tearDown() throws Exception {
        sortedString=null;
    }
    @Test
    public void stringSortedintoAsscebding()
    {
        String string="Harry Olive Alice Bluto Eugene";
        TreeSet<String> list=new TreeSet<>();
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");
        list.add("Harry");
        list.add("Olive");
        assertEquals(list,sortedString.sortedString(string));

    }
    @Test
    public void stringSortedNotEqualsConditon()
    {
        String string="Harry Olive Alice Bluto Eugene";
        TreeSet<String> list=new TreeSet<>();
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");
        list.add("Olive");
     //   list.add("Harry");
        assertNotEquals(list,sortedString.sortedString(string));

    }
    @Test
    public void stringNullPointerException()
    {
        assertNull(sortedString.sortedString(null));
    }

}