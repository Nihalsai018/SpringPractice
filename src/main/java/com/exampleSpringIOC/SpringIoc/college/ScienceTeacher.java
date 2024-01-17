package com.exampleSpringIOC.SpringIoc.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("here we get science tutoriels ny rani");
    }
}
