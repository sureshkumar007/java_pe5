package com.stackroute.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

public class UpdateSetTest {
    UpdateSet arrayElementUpdate;

   @Before
   public void setup() {
       arrayElementUpdate = new UpdateSet();
   }

   @After
   public void teardown()
   {
       arrayElementUpdate=null;
   }

   @Test
   public  void givenArrayShouldReturnUpdateArrayList(){
       assertEquals(Arrays.asList("Apple","Grape","Melon","Berry"),arrayElementUpdate.arrayUpdate(Arrays.asList("Apple","Kiwi","Melon","Berry"),"Kiwi","Grape","Melon","Berry"));
   }

   @Test
   public  void givenEmptyArrayShouldReturnArrayList(){
       assertEquals(Collections.emptyList(),arrayElementUpdate.arrayUpdate(Arrays.asList("Apple","pineapple"),"Kiwi","Grape","Melon","Berry"));
   }


   @Test(expected = NullPointerException.class)
   public void givenArrayShouldRetunNullList() {
       assertEquals(Collections.emptyList(), arrayElementUpdate.arrayUpdate(null, "Kiwi","Grape","Melon","Berry"));
   }


}
