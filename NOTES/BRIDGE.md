# BRIDGE 🌉

> Structural design pattern

- Our implementation & abstractions are generally coupled to each other in normal inheritance.

- Using bridge pattern we can decouple them so they can both change without affecting each other.

- We achieve this feat by creating two separate inheritance hierarchies; one for implementation and another for abstraction.

- We use composition to bridge these two hierarchies.

### Roles

- **Role - Abstraction**: defines abstractions's interface & has reference to implementor. It delegates all the real work to the implementor.

- **Role - Implementor**: Base interface for implementation classes. It defines the interface for implementation classes.
  \_\* methods are unrelated to abstraction & are not known by abstraction.

## Implementation Steps 🍲

We start by defining our abstraction as need by client

- We determine common base operations and define them in abstraction.
- We can optionally also define a refined abstraction & provide more specialized operations.
- Then we define our implementor next. Implementor methods do NOT have to match with abstractor methods. However, abstraction can carry out its work by using implementor methods.
- Then we write one or more concrete implementor providing implementation.

Abstraction are created by composing them with an instance of concrete implementor which is used by methods in abstraction.

### Implementation Considerations 🤔

- In case we are ever going to have a single implementation then we can skip creating abstract implementor.

- Abstraction can decide on its own which concrete implementor to use in its constructor or we can delegate that decision to a third class. In last approach abstraction remains unaware of concrete implementors & provides greater de-coupling.

### Design Considerations 🧐

- Bridge provides great extensibility by allowing us to change abstraction and implementor independently. You can build & package them separately to modularize overall system.
- By using abstract factory pattern to create abstraction object with correct implementation you can decouple concrete implementors.

## Pitfalls

- It is fairly complex to understand & implement bridge design pattern.

* You need to have a well thought out & fairly comprehensive sign in front of you before you can decide ob bridge pattern.
* Needs to be designed up front. Adding bridge to legacy code is difficult. Even for ongoing project adding bridge at later time in development may require fair amount of rework.

## Summary

- We use bridge pattern when we cant our abstractions and implementations to be decoupled.

- Bridge pattern defines separate inheritance hierarchies for abstraction & implementations and bridge these two together using composition.

- Implementations **do NOT have to define methods that match up** with methods in abstraction. It is fairly common to have primitive methods; methods which do small work; In implementor. Abstraction uses these methods to provide its functionality.
