# Adapter Pattern 🧭

**Structural Design Pattern** 🛠️

![Adapter Design Pattern](assets/adapter.jpg)

## What is Adapter? 🤔

The Adapter pattern addresses the scenario where an existing object provides the required functionality, but the client code expects a different interface. By using the Adapter pattern, we can make the existing object work with the client by adapting it to the client's expected interface. This pattern is sometimes referred to as a wrapper, as it "wraps" the existing object.

### Implementing an Adapter 🛠

There are two common approaches to implementing an adapter:

1. **Class Adapter**: Inherit from the existing class and implement the target interface. This approach allows for the override of some of the adaptee's behavior, but it can lead to confusion and difficulty in debugging.

2. **Object Adapter**: Use composition to implement the target interface and accept the adaptee as a constructor argument. This approach is more flexible and allows for the use of subclasses of the adaptee.

### Implementation Considerations 🌟

- The amount of work the adapter needs to do depends on the differences between the target interface and the object being adapted. If the method arguments are similar, the adapter has less work to do.
- Class adapters may expose unrelated methods in part of your code, leading to pollution. Avoid using class adapters unless absolutely necessary.

### Design Considerations 🌟

- In Java, class adapters may not be feasible if both the target and adaptee are concrete classes. Object adapters are typically preferred in Java due to the lack of private inheritance.
- Object adapters offer greater flexibility and can stand in for both the target interface and the adaptee, making them a more versatile solution.

## Pitfalls to Avoid 🚧

- It's tempting to include additional functionality in the adapter besides simple interface translation. However, doing so can lead to the adapter behaving differently from the adapted object, resulting in confusion and bugs.

>[!IMPORTANT]
>As long as adapters stick to their purpose of simple interface translation, they are effective and reliable.

## Summary 📚

The Adapter pattern is a valuable tool for integrating existing objects with client code that expects a different interface. By carefully choosing between class and object adapters and avoiding unnecessary complexity, you can leverage adapters to enhance the flexibility and compatibility of your software.

