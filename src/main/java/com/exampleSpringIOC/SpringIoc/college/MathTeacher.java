package com.exampleSpringIOC.SpringIoc.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MathTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("here we can get the maths tutorial by ramesh");
    }
}
