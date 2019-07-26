package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class WordCountTest
{
    WordCount wordCount;

    @Before
    public void setUp() throws Exception
    {
        this.wordCount=new WordCount();
    }

    @After
    public void tearDown() throws Exception
    {
        this.wordCount=null;
    }

    @Test
    public void countWords()
    {
        Map<String,Integer> maps=new TreeMap<String,Integer>();
        maps.put("one",5);
        maps.put("two",2);
        maps.put("three",2);

        String str="one one -one___two,,three,one @three*one?two";
            assertEquals(maps,wordCount.countOccuranceWord(str));
    }
    @Test
    public void occuranceNotEqualsChecker()
    {
        {
            Map<String,Integer> maps=new TreeMap<String,Integer>();
            maps.put("one",5);
            maps.put("two",3);
            maps.put("three",2);

            String str="one one -one___two,,three,one @three*one?two";
            assertNotEquals(maps,wordCount.countOccuranceWord(str));
        }
    }
    @Test
    public void nullException()
    {
        assertNotNull(wordCount.countOccuranceWord(" "));
    }
}