package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyStringTest
{
    ModifyString modifyString;

    @Before
    public void setUp() throws Exception
    {
       this.modifyString=new ModifyString();
    }

    @After
    public void tearDown() throws Exception
    {
        modifyString=null;
    }
    @Test
    public void replaceString()
    {
        String expected="{val1= , val2=java}";
        Map<String,String> map=new LinkedHashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        assertEquals(expected,modifyString.modifyTheString(map));
    }
    @Test
    public void nullCheckingCondition()
    {
        String actual=modifyString.modifyTheString(null);
        assertNull(null);
    }
    @Test
    public void replaceStringFunction()
    {
        String expected="{val1= , val2=mars}";
        Map<String,String> map=new LinkedHashMap<>();
        map.put("val1","mars");
        map.put("val2","saturn");
        assertEquals(expected,modifyString.modifyTheString(map));
    }
}