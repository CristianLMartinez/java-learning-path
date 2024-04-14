package org.example.singleton;

public class LazyRegisterWitthDCL {
    
    private LazyRegisterWitthDCL(){}

    private static volatile LazyRegisterWitthDCL INSTANCE;

    public static LazyRegisterWitthDCL getInstance(){
        if(INSTANCE == null) {
            synchronized (LazyRegisterWitthDCL.class) {
                if(INSTANCE == null) {
                    INSTANCE = new LazyRegisterWitthDCL();
                }
            }
        }
        return INSTANCE;
    }


}
