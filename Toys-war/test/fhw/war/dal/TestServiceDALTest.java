package fhw.war.dal;

import fhw.iface.ITestService;
import javax.inject.Inject;
import org.jglue.cdiunit.ActivatedAlternatives;
import org.jglue.cdiunit.CdiRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;


@RunWith(CdiRunner.class)
@ActivatedAlternatives({RemoteServiceProducer.class})
public class TestServiceDALTest
{
    
    @Inject
    private ITestService testService; 
    
    public TestServiceDALTest()
    {
    }
    
    
    @Test
    public void testMakeMessage()
    {
        System.out.println("makeMessage");
        String inMess = "UNIT Test Me!";
        String result = testService.makeMessage(inMess);
        System.out.println(result); 
    }
}