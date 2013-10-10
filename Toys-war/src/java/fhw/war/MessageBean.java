package fhw.war;

import fhw.war.dal.TestServiceDAL;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


@Named(value = "messageBean")
@RequestScoped
public class MessageBean
{
    private String message;
    
    @Inject 
    private transient TestServiceDAL testServiceDAL; 

    
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
        message = testServiceDAL.makeMessage(message); 
    }
}
