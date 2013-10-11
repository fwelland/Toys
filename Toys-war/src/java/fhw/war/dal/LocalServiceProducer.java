
package fhw.war.dal;

import fhw.iface.ITestService;
import javax.ejb.EJB;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

@Default
public class LocalServiceProducer 
{
    @EJB
    private transient ITestService testService;     
    
    @Produces
    public ITestService getTestService()
    {
        return(testService); 
    }

}
