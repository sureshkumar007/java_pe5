package com.stackroute.pe5;

import java.net.SocketOption;
import java.util.Map;

public class ModifyString
{
    /*
    Checking the null pointer exception
     */

    public String modifyTheString(Map<String,String> map)
    {
       if(map==null)
       {
           return null;
       }
       else
       {
           /*
           If the null pointer is not raised than it takes the string
            */
           String string=map.get("val1");

           map.replace("val1"," ");
           map.replace("val2",string);
            System.out.println(map.toString());
            return map.toString();

       }
    }
}
