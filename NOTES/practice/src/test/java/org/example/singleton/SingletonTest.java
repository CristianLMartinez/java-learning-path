package org.example.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SingletonTest {


    @Test
    public void lazyWithDCL(){
        LazyRegisterWitthDCL instance1 = LazyRegisterWitthDCL.getInstance();
        LazyRegisterWitthDCL instance2 = LazyRegisterWitthDCL.getInstance();
        assertEquals(instance1, instance2);        
    }

    @Test
    public void Eager(){
        EagerRegister instance1 = EagerRegister.getInstance();
        EagerRegister instance2 = EagerRegister.getInstance();
        assertEquals(instance1, instance2);
    }

    @Test
    public void lazyRegistryIODM(){
        LazyRegistryIODM instance1 = LazyRegistryIODM.getInstance();
        LazyRegistryIODM instance2 = LazyRegistryIODM.getInstance();
        assertEquals(instance1, instance2);
    }


}
