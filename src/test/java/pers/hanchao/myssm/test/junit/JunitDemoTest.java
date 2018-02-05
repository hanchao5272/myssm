package pers.hanchao.myssm.test.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* JunitDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>02/05/2018</pre> 
* @version 1.0 
*/ 
public class JunitDemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(int a, int b) 
* 
*/ 
@Test
public void testAdd() throws Exception {
    Assert.assertEquals(2,JunitDemo.add(1,1));
} 


} 
