# Singleton 

* A singleton class has only one instance, accesible globally through a single point (via a method / field)
* Main problem this pattern solves is to ensure that only a single instance of this class exits.
* Any state you add in you singleton becomes part of *"global state"* of you application 

<img src="assets/singleton.png" alt="Singleton design patter" />

### Implement a Singleton

Controlling instance creation:
* class constructor must be not be accesible globally
* subclassing/inherintance must not be allowed
Keeping track of instance:
* class itself is a good place to track the instance
Giving access to the singleton instance:
* A public static method is good choice
* Can expose instance as final public static field but it won't work for all singleton implementations

### Options

There are two options for creating a singleton:
* *Early initialization - Eager singleton*: Create singleton as soon as class is loaded.
* *Lazi initialization - Lazy singleton*: Singleton is created when it is first required.

```java
public class EagerRegistry {
    private EagerRegistryj(){}
    private static volatile EagerRegistery INSTANCE = new EagerRegistry();
    public static EagerRegistry getInstance(){
        return INSTANCE; 1
    }
}
```

```Java
public class LazyRegistryWithDcl {
    private LazyRegistryWithDcl(){}
    private static LazyRegistryWithDcl INSTANCE;
    public static LazyRegistryWithDcl getInstance(){
        if(INSTANCE == null){
            synchronized (LazyRegistryWithDcl.class) {
                if(INSTANCE == null) {
                     INSTANCE = new LazyRegistryWithDcl();
                }
            }
        }
        return INSTANCE;
    }
}
```

```java 
public class LazyRegistryIODM {
    private LazyRegistryIODM(){}
    private static class RegistryHolder {
        static LazyRegistryIODM INSTANCE = new LazyRegistryIODM();
    }
    public static LazyRegistryIODM getInstance (){
        return RegistryHolder.INSTANCE;
    }
}
```

```java
public enum RegistryEnum {
    INSTANCE;
    public void getConfiguration(){

    }
}
```

### Implementation Consideration :glasses:
* Early / Eager initialization is the simplest & preferred way. Always try to use this approach first.
* The "classic" signleton pattern implementation uses double check locking and volatile field.
* The *lazy initialization holder idiom* provides best of both worlds, you don't deal with synchronization issues directly and is easy to implement.
* You can also implemenation singletons using enums. However due to pre-conceptions about what an enums is, it may be a hard sell during code review especially if singleton has mutable fields.
* If the simple solution works then use it.

### Design Considerations :glasses:
* Singleton creation does not need any parameters. I fyou find yourself in need of support for constructor arguments, you need a simple factory or factory method pattern instead.
* Make sure that yuour singletons are not carrying a lot of mutable global state.


### Example in Java class library

> The java.lang.Runtime class in standart Java API is a singleton
```java
public class Runtime {
    private static Runtime currentRuntime = new Runtime();
    public static Runtime getRuntime(){
        return currentRuntime;
    }
    //** Don't let anyone construc this class */
    private Runtime(){}
}
```


### Pitfalls :waterfall:
* Singleton pattern can deceive you about true dependencies! Since they eare globally accessible its easy to miss dependencies.
* There are hard to unit test. You cannot easily mock the instance that is returned.
* Most commom way to implement singletons in Java is through static variables and they are held per class loader and not per JVM. So they may not be tryly Singleton in an OSGi or web application.
* A singleton carrying around a large mutable global state is a good indication of an abused Singleton.

## Summary :pencil:

* Singleton patter is usen when you want to ensure that only one instance of a class exists in application.
* In java we achieve this by making consructor private, this also prevents inheritance & providing a public static method which returns the singleton instance.
* Implementation wise we have ttwo broad choices: 
_* in eager
_* in lazy
* Always prefer the eager loading instance unless creation cost is high and start-up time impact is noticeable.




