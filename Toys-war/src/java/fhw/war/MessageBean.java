package fhw.war;

import fhw.iface.ITestService;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "messageBean")
@RequestScoped
public class MessageBean
{
    private String message;
    
    @EJB
    private transient ITestService testService; 
    
    public MessageBean()
    {
    }


    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
    
    public void processGoButton()
    {
        String newMessage = testService.makeMessage(message); 
        message = newMessage; 
    }
}
