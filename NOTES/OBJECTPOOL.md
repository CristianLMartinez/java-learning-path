# Object Pool

* in our system if cost of creating an instance of a class is high and we need a large umber of objects of this class for short duration, then we can use an object pool.
* Here we either pre-create objects of the class or collect unused instances in an in memory cache. When code need an object of this class we provide it from this cache.
* One of the most complicated patterns to implement.

## Implementation Steps :pencil:

We start by creating class for object pool:
* A threat-safe caching of objects should be done in pool.
* Methods to acquire and release objects should be provided & pool should reset cached objects before giving them out.
The reusable object must provide methods to reset its state up "release" by code.
> We have to decide whether to create new pooled objects when pool is empty or to wait until an object becomes available. Choice is influenced by whether the object is tied to a fixed number of external resources.


### Implementation considerations

* Resetting object state should not be costly operation otherwise you may end up losing your performance savings.   
* Pre-create objects; meaning creating objects in advance can be helpful as it won't slow down the code using these objects. However it may add-up to start up time & memory comsumption. 
* Object pool's synchronization should consider the reset time need & avoid resetting in synchronization context if possible.

### Design Considerations
* Object pool can be parametrized to cache & return multiple objects and the acquire method can provide selection criteria.
* Pooling objects is only beneficial if they involve  costly initialization  because of initialization of external resource like a connection or a thread. Don't pool objects JUST to save memory, unless you are running into out of memory errors.
* Do not pool long lived objects as it may lead to memory leaks. Pooling may actually negatively impact performance in such cases.


### Examples of object pool
* Using object pool for saving the memory allocation & GC cost is almost deprecated now. JVMs & hardware are more efficent & have access to more memory now.
* However it is still a very common pattern when we are interacting with external resources like threads, connections, etc.

An example is 
> java.util.concurrent.ThreadPoolExecutor // is an example of objecty pool in Java. 

>[!NOTE]
>We have cached objects that frequently live throughout programs entire run.


## Pitfalls :happy:

[ ]: Successful implementation depends on correct use by the client code. Releasing objects back to pool can be vital for correct working.
[ ]: The reusable object needs to take care of resetting its state  in efficient way. Some objects may not be suitable for pooling due to this requirements. 
[ ]: Pooling can lead to memory leaks if not handled properly. 
[ ]: Pooling can lead to performance degradation if not used correctly. 
[ ]: Pooling can lead to deadlocks if not used correctly. 
[ ]: Dificult to use in refactoring legacy code as the client code & reusable object both need to be aware of object pool.
[ ]: Object pool can be difficult to implement in multi-threaded environment. 

## Summary :cloud:

* If cost creating instances of  a class is very high and you need many such objects throught your application for short duration then you can pool them with object pool.
* Typically objects that represent fixed external system resources like threads, connections or other system resources are good candidates for pooling.
* Pool must handle synchronization, object reset, object creation & object destruction.
* Client code must release pooled objects back into the pool so they can be reused. Failing to do so will break the system. Thread pools can work around this since the  thread can know when its work is done.







