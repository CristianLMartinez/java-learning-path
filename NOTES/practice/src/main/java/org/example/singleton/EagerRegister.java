package org.example.singleton;

public class EagerRegister {
        
        private EagerRegister(){}
    
        private static final EagerRegister INSTANCE = new EagerRegister();
    
        public static EagerRegister getInstance(){
            return INSTANCE;
        }
}
