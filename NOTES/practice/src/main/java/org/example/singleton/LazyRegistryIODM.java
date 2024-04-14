package org.example.singleton;

public class LazyRegistryIODM {
    
        private LazyRegistryIODM() {
        }
    
        private static class RegistryHolder {
            static LazyRegistryIODM INSTANCE = new LazyRegistryIODM();
        }
    
        public static LazyRegistryIODM getInstance() {
            return RegistryHolder.INSTANCE;
        }
}
