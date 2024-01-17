package com.exampleSpringIOC.SpringIoc.Phone;

import com.exampleSpringIOC.SpringIoc.Phone.Mobile;
import com.exampleSpringIOC.SpringIoc.Phone.MobileModel;
import org.springframework.beans.factory.annotation.Autowired;

public class OnePlus implements Mobile {


   public MobileModel mm;
    OnePlus(MobileModel getmodel){
        this.mm=getmodel;
    }
    @Override
    public void getModelColours() {
        System.out.println("onepus is blue clour");
        mm.getOnePlusModel();
    }
}
