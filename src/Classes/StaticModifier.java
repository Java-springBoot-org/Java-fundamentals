package Classes;

//In Java, the static keyword is used to indicate that a member (i.e., a field or a method) of a class belongs to the class itself, rather than to a specific instance of the class. A static member is shared by all instances of the class and can be accessed using the name of the class, rather than an instance of the class.
public class StaticModifier {
    // static field
    private static int count;

    // instance method
    public void increment() {
        count++;
    }

    // static method
    public static int getCount() {
        return count;
    }

    public static void main(String [] args) {
        StaticModifier c1 = new StaticModifier();
//        To access the count field from an instance of the Counter class, you can use the increment method:
        c1.increment();

//        To access the count field from the class itself, you can use the getCount method:
        System.out.println(StaticModifier.getCount());
    }
}



