package com.stackroute.pe5;

import java.util.*;

public class CountChar
{
    /*
    Return the count word
     */
    public Map<String,Boolean> countWords(String string[])
    {
    Map<String,Boolean> map=new LinkedHashMap<>();
        List<String> list= Arrays.asList(string);
        for(String str:list)
        {
            /*
            check the string is empty or not
             */
            if(!str.isEmpty())
            {
                /*
                By default it is empty
                 */
                if(!map.containsKey(str))
                {
                    boolean b=false;
                    if(Collections.frequency(list,str)>=2) {
                        b = true;

                    }
                    map.put(str,b);
                    System.out.println(map);

                }
            }
        }
        return map;
    }
}

