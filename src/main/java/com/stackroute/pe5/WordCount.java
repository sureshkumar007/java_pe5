package com.stackroute.pe5;
import java.util.*;

public class WordCount
{
/*
Check the null pointer exception in the string
 */
    public boolean nullException(String str)
    {
        boolean b=false;
        if(str==null)
        {
            return b=true;
        }
        else {
            return b;
        }

    }
    /*
    Return the string in the form of map<String, Integer>
     */
    public Map<String,Integer> countOccuranceWord(String str)
    {

        System.out.println(str);
        String[] strings=str.trim().split("\\W|_| ");

        Map<String,Integer> map=new TreeMap<String, Integer>();
        List<String> list= Arrays.asList(strings);
        System.out.print(list);
        for(String element:strings) {
            if (!element.isEmpty()) {
               // if (!map.containsKey(element)) {
                    map.put(element, Collections.frequency(list, element));
                //}
            }
        }
        return map;

        }

    }

