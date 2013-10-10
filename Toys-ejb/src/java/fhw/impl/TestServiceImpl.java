package fhw.impl;

import fhw.iface.ITestService;
import java.util.Date;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(ITestService.class)
public class TestServiceImpl 
    implements ITestService
{
    @Override
    public String makeMessage(String inMess)
    {
        StringBuilder sb = new StringBuilder();
        sb.append('{').append(inMess).append('}').append('@').append(new Date().toString());
        return(sb.toString());
    }
}
