# FACTORY METHOD

We use this pattern when we do not know in advance
which call we may need to instantiate beforehand and also to 
allow new class to add to system and handle their creation without
affecting client code.

>[!NOTE]
> We let subclasses decide which object to instantiate by overriding the factory method

### Implement factory method 

We start by creating a class for our creator:
* Creator itself can be concrete if it can provide a default object or it can be abstract.
* Implementations will override the method and return and object.


>[!IMPORTANT]
> Don't forget check the pitfall of use Factory Method.