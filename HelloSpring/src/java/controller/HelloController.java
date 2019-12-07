/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.BindException;
import javax.servlet.http.*;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HelloService;

/**
 *
 * @author ALVIN
 */
public class HelloController extends SimpleFormController {
    private HelloService helloService;
    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context
        
        setCommandClass(Name.class);    //sets the name of the command class
        setCommandName("name");         //defines the name of the command in the model
        setSuccessView("helloView");    // sets the name of the view that should display upon a successful submit
        setFormView("nameView");        //sets the name of the view that is used to display the form, the webpage
    }
    
    

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
    //@Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        
            Name name = (Name)command;
        
        ModelAndView mv = new ModelAndView(getSuccessView());
        //Do something...
        mv.addObject("helloMessage", helloService.sayHello(name.getValue()));
        return mv;
    }
    public void setHelloService(HelloService helloService)
    {
        this.helloService = helloService;
    }
     
}
