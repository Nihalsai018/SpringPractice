package com.exampleSpringIOC.SpringIoc.Phone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileConfig {
//    @Bean
//    public MobileModel getmodel(){
//        return new MobileModel();   // dout can we create like this without creating bean can we pass object directly
//    }
    @Bean()
    public Mobile getOnePlusObject( ){
       return new OnePlus(new MobileModel());
//        Mobile o=new OnePlus(new MobileModel());
//        return o;
    }
    @Bean()
    public Mobile getIponeObject(){
        return  new Iphone();
    }
}
