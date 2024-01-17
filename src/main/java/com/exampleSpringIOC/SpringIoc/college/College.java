package com.exampleSpringIOC.SpringIoc.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Value("maissamaguda,HYD")
    private String collegeAddress;

    @Autowired   // it is used to inject the princpial call objects (created by componet in princpial) to the college class
    private Principal principal;
//    public College(Principal principal,Teacher teacher) { //constrtour injection
//        this.principal = principal;
//        this.teacher=teacher;
//    }
//public void setPrincipal(Principal principal) {     // setter injection
//    this.principal = principal;
//}
     @Autowired
     @Qualifier("mathTeacher")
    private Teacher teacher;
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }



    public  void test(){
        principal.PrincipalInfo();
        teacher.teach();
        System.out.println("name of the college is  mallaReddy ");
        System.out.println("my college location is :- "+collegeAddress);


    }


}
