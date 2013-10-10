package fhw.war.dal;

import fhw.iface.ITestService;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class TestServiceDAL 
{
    
    @EJB
    private transient ITestService testService;     

    public String makeMessage(String inMess)
    {
        return(testService.makeMessage(inMess)); 
    }    
    
}
