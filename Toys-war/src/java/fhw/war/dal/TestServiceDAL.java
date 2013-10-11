package fhw.war.dal;

import fhw.iface.ITestService;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ApplicationScoped
public class TestServiceDAL 
{
    
    @Inject
    private transient ITestService testService;     

    public String makeMessage(String inMess)
    {
        return(testService.makeMessage(inMess)); 
    }    
    
}
