package Classes;
//
//In Java, the protected modifier is used to indicate that a member (i.e., a field or a method) of a class is accessible within the class itself and within subclasses of the class, but not from outside the class or its subclasses. A protected member can be accessed directly by subclasses of the class and can be accessed through the public methods of the class by other classes in the same package.
//
//        The protected modifier is similar to the private modifier, but it allows subclasses to access the protected member. This can be useful when designing a class hierarchy, as it allows subclasses to override or extend the behavior of the protected member without breaking encapsulation.
public class ProtectedModifier {
    // protected field
    protected String name;

    // public method
    public String getName() {
        return name;
    }

    // public method
    public String setName(String name) {
        this.name = name;
        return name;
    }
}

class Admin extends ProtectedModifier {
    // protected field inherited from User
    // public method inherited from User

    // subclass method that accesses the protected field
    public String rename(String newName) {
        return setName(newName);
    }

    //To access the name field from another class in the same package, you can use the getName and setName methods
    public static void main(String[] args) {
        ProtectedModifier pr = new ProtectedModifier();
        System.out.println(pr.setName("Alice"));
    }
}

