
package fhw.war.dal;

import fhw.iface.ITestService;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Properties;
import javax.ejb.EJB;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.naming.Context;
import javax.naming.InitialContext;

@Alternative
public class RemoteServiceProducer 
{
   public RemoteServiceProducer()
   {
       
   }
   
   private Context loadInitialContext()
            throws Exception
    {
        Context ic = new InitialContext();
        Hashtable<?, ?> ht = ic.getEnvironment();
        if (null == ht || ht.isEmpty() || !icSeemsOK(ht))
        {
            InputStream istream = Thread.currentThread().getContextClassLoader().getResourceAsStream("jndi.properties");
            Properties config = new Properties();
            config.load(istream);
            istream.close();
            ic = new InitialContext(config);
        }
        return (ic);
    }

    private boolean icSeemsOK(Hashtable<?, ?> ht)
    {
        boolean b = false;
        Object o = ht.get(Context.INITIAL_CONTEXT_FACTORY);
        if (null != o)
        {
            String s = o.toString();
            b = s.contains("SerialInitContextFactory");
        }
        return (b);
    } 
    
    @Produces
    public ITestService getTestService()
            throws Exception
    {
        Context ic = loadInitialContext();
        Object o = ic.lookup("java:global/Toys/Toys-ejb/TestServiceImpl!fhw.iface.ITestService");
        return ((ITestService) o);        
    }

}
