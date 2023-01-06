package Classes;

//
//In Java, an inner class is a class that is defined within another class or interface. Inner classes have access to the members of the enclosing class and can be used to organize code and improve encapsulation. There are several types of inner classes in Java, including static inner classes, non-static inner classes (also known as inner classes or inner classes), local inner classes, and anonymous inner classes.Here is an example of a static inner class in Java:

public class InnerClassExample {
    public class OuterClass {
        // instance variables of the outer class
        private int x;
        private int y;

        // non-static inner class
        public class InnerClass {
            // inner class members go here
            public void doSomething() {
                // inner class can access the instance variables of the outer class
                System.out.println(x + y);
            }
        }
    }

//    OuterClass outer = new OuterClass();
//    OuterClass.InnerClass inner = outer()

}
