package com.exampleSpringIOC.SpringIoc;

import com.exampleSpringIOC.SpringIoc.sim.Sim;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIocApplication.class, args);






//---------------------------------------------------------------------------------------------------
 // by using annotions
	//	SimConfig s=new SimConfig(new Airtel()); // it is for constructor injection

//		SimConfig s= new SimConfig  ();
//		s.setMobile(new Airtel()); // it is method injection k

	//	SimConfig s1=new SimConfig(new Idea());

        //by using xml configuration


        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
       Sim mobile=context.getBean("sim", Sim.class);
       mobile.simslot();
        System.out.println("config loaded");
      //  Mobile m=context.getBean("")

    }


}
