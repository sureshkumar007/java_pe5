package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountCharTest
{
    CountChar countChar;
    @Before
    public void setUp() throws Exception
    {
        countChar=new CountChar();
    }

    @After
    public void tearDown() throws Exception
    {
        countChar=null;
    }
    @Test
    public void countCheck()
    {
        String[] strings={"a","b","c","d","a","b","b"};
        HashMap<String,Boolean> hashMap=new HashMap<>();
        hashMap.put("a",true);
        hashMap.put("b",true);
        hashMap.put("c",false);
        hashMap.put("d",false);
        Map<String,Boolean> strings1=countChar.countWords(strings);
        assertEquals(hashMap,strings1);

    }
}