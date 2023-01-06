package Classes;

//In Java, the private modifier is used to indicate that a member (i.e., a field or a method) of a class is accessible only within the class itself, and not from outside the class. A private member cannot be accessed directly by other classes, and can only be accessed through the public methods of the class.
//
//        The private modifier is used to enforce encapsulation, which is the practice of hiding the implementation details of a class from other classes and exposing a limited set of public methods for interacting with the class. Encapsulation helps to protect the internal state of a class from being modified by external code and ensures that the class can be used in a predictable and consistent way.
public class PrivatedModifier {
    // private field
    private String name;

    // public method
    public String getName() {
        return name;
    }

    // public method
    public void setName(String name) {
        this.name = name;
    }
}

