package com.exampleSpringIOC.SpringIoc.sim;

public class SimConfig {
    Sim mobile=null;

//    public SimConfig(Mobiles simType){ //constructor injection
//       mobile=simType;
//       mobile.simslot();
//
//    }


    public void setMobile(Sim simtype) {  //setmethod injection
        mobile = simtype;
        mobile.simslot();
    }
}
