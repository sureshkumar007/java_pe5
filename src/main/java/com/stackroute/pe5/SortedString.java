package com.stackroute.pe5;

import javax.swing.event.TreeSelectionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SortedString
{
    public TreeSet<String> sortedString(String str) {
        if (str == null)
        {
return null;

        } else {
            String[] strings = str.trim().trim().split(" ");
            List<String> list = Arrays.asList(strings);
            TreeSet<String> treeSet = new TreeSet<>(list);
            System.out.println(treeSet);
            return treeSet;
        }
    }
}
