public interface Payment {
    void pay();
    default void cardPayment(){
//        Backward Compatibility: The primary purpose of default methods is to allow the evolution of interfaces. Before Java 8, if a new method was added to an interface, all implementing classes would break until they provided an implementation. Default methods solve this by providing a base implementation that implementing classes automatically inherit.
//        Optional Overriding: Classes that implement an interface with a default method are not required to override it; they can use the default implementation as provided. However, they can override the method if a specific implementation is needed.
//        Syntax: Default methods are marked with the default keyword in the interface declaration. They are implicitly public
    }
}
