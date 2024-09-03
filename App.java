package com.work.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        
    	@SuppressWarnings("resource")
		ApplicationContext factory = new AnnotationConfigApplicationContext(Appconfig.class);			
    	
    	Samsung s7 = factory.getBean(Samsung.class);
    	//Samsung s7 = new Samsung();
    	s7.config();
    	
    	System.out.println( "Hello World!" );
    }
}
