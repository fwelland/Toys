package fhw.war.dal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestServiceDALTest
{
    
    public TestServiceDALTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    @Test
    public void testMakeMessage()
    {
        System.out.println("makeMessage");
        String inMess = "";
        TestServiceDAL instance = new TestServiceDAL();
        String expResult = "";
        String result = instance.makeMessage(inMess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}