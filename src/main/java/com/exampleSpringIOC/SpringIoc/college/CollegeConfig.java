package com.exampleSpringIOC.SpringIoc.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration // it is not requried when we use componet , only used when bean annotion
// if i dont want any beans i want to configure objects manually i acn use component and autowire
@ComponentScan(basePackages = "com.exampleSpringIOC.SpringIoc.college")

public class CollegeConfig {
//    @Bean
//    public Principal principalBean(){
//        return new Principal();
//    }
//    @Bean
//    public Teacher mathteacherBean(){
//        return new MathTeacher();
//    }
//
//    @Bean
//    public  College collegeBean(){ // method name =id
//     //   return new College();                                               //1 without any dependinces pure ioc
//      // return new College(new Principal());                                 // 2 college with one depdincey principal  or we can pass method name  principalBean()
//      //  College college=new College(new Principal(),new MathTeacher());    // 3 only college constructor  with two depedices with princpial and teacher
//        //or
//        College college =new College();
//        college.setPrincipal(new Principal()); // or insert bean insted oj object
//        college.setTeacher(new MathTeacher());
//
//        return college;
//    }

}
