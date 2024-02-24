# Builder 

Builder allow us remove the constructor logic when an object is created, and this is important in classes that have a lot of attributes.

### Implement a builder

We start by creating a builder

* Identify the "parts" of the product & provide methods to create those parts

* It should prove a method to "assemble" or build the product/object.

* It must provide a way/method to get fully built object out. Optionally builder can keep reference to an product it has product it has built so the same can be returned again in future.

* A director can be a separate clas or client can play the role of director 


### Implementation Considerations
* You can easily create an immutable class by implementing builder as an inner static class. You'll find this type of implementation used quite frequently even if immutabilitiy is not a main concern.

### Design Considerations

* The director role is rarely implemented as separate class, typically the consumer  of the object instance or the client handles that role.

* Abstract builder is also not required if "product" itself is not  part of any inheritance hierarchy. You can directyly create concrete builder .

* If you are running into a "too many constrctur arguments" problem it's a good indication that builder pattern may help you.


### Differences between Builder and Prototype design pattern

>[!TIP]
>Prototype: it's a creational design pattern that use clonation (clone method copy the exist object)


| BUILDER                               | PROTOTYPE                               |
-----------------------------------------------------------------------------------
| you have a complex constructor and  builder allow us to work with that  | Prototype allow us to altogether skip  using constructor.                      |
| We can create builder as a separate class and so it can work with legacy code | In java this pattern works using clone method, and needs to motify existing code so may not work with legacy code |


### Pitfalls

* A little bit of complex for new comers mainly because of "method chaining", where builder methods return builder objets itself.
* Possiblity of partially initialized object; user code can set only a few or none properties using with XXX methods  and call build().
If required properties are missing, build ethod should provided suitable  defaults or throw exception 

### Summary 

1. Think of builder pattern when you have a complex constructor or an object is build in multiple steps.
2. 