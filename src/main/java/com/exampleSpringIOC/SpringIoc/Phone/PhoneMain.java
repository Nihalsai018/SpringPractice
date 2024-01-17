package com.exampleSpringIOC.SpringIoc.Phone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PhoneMain {
    public static void main(String[] args) {


		//		Mobile m=new OnePlus();
//		m.getModelColours();
//		Mobile m1=new Iphone();
//		m1.getModelColours();
        // insted of creating objects we use single tone objects we create only one ooject in configure clas and use by methods

		ApplicationContext con= new AnnotationConfigApplicationContext(MobileConfig.class);
		Mobile m0=con.getBean("getOnePlusObject",Mobile.class); // new Oneplus(), Onee plus constructor is created so trigred to oneplus class
		m0.getModelColours();
		Mobile mi=con.getBean("getIponeObject",Mobile.class);
		mi.getModelColours();
        	//this is working fine

    }
}
