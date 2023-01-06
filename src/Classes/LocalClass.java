package Classes;
//
//In Java, a local class is a class that is defined within a block of code, such as a method or a for loop. Local classes are similar to inner classes, but they are not nested within another class and are only visible within the block in which they are defined.
//
//        Here is an example of a local class in Java:



public class LocalClass {
//    methods
public void myMethod() {
    // define a local class within a method
    class LocalClassExmp{
        // local class members go here
    }
    // use the local class
    LocalClass local = new LocalClass();
}
}


